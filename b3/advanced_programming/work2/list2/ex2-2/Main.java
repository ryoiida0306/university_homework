public class Main {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        Solver solver = new Solver();
        solver.solve(new State(new World()));

        long endTime = System.currentTimeMillis();

        System.out.println("実行時間："+(endTime-startTime));
        solver.printEvaluation();
        solver.printMaxOpenListSize();
    }
}
