public class ODETester {
    public static void main(String[] args) {
        FreeFall freeFall = new FreeFall(12.5, 68.1);
        Task_4 solver = new Task_4(freeFall);
        double[] solution = solver.integrateODE(100, 01, 0);
    }
}
