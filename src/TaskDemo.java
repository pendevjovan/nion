import java.util.*;
import java.util.stream.*;

enum Status {PENDING, DONE}

class Task {
    final int id;
    final String title;
    final int priority;
    Status status = Status.PENDING;

    Task(int id, String title, int priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "#" + id + "(" + priority + ") " + title + " [" + status + "]";
    }
}

class TaskService {
    private final Map<Integer, Task> byId = new HashMap<>();

    public void add(Task t) {
        if (byId.containsKey(t.id)) throw new IllegalArgumentException("Duplicate id");
        byId.put(t.id, t);
    }

    public void complete(int id) {
        Task t = Optional.ofNullable(byId.get(id))
                .orElseThrow(() -> new NoSuchElementException("No task " + id));
        t.status = Status.DONE;
    }

    public List<Task> getPendingSorted() {
        return byId.values().stream()
                .filter(t -> t.status == Status.PENDING)
                .sorted(Comparator.comparingInt((Task t) -> t.priority)
                        .thenComparing(t -> t.title.toLowerCase()))
                .toList();
    }

    public Map<Status, List<Task>> groupByStatus() {
        return byId.values().stream().collect(Collectors.groupingBy(t -> t.status));
    }
}

public class TaskDemo {
    public static void main(String[] args) {
        TaskService s = new TaskService();
        s.add(new Task(1, "Write docs", 2));
        s.add(new Task(2, "Fix bug", 1));
        s.add(new Task(3, "Refactor", 3));
        s.complete(2);
        System.out.println("Pending sorted: " + s.getPendingSorted());
        System.out.println("Grouped: " + s.groupByStatus());
    }
}