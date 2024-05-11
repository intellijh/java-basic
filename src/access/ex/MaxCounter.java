package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (isCountValid()) {
            System.out.println("값을 증가시킵니다.");
            count++;
            return;
        }
        System.out.println("최대값입니다.");
    }

    private boolean isCountValid() {
        if (count == max) {
            return false;
        } else {
            return true;
        }
    }

    public int getCount() {
        return count;
    }
}
