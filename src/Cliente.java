public class Cliente implements Runnable {
    private int id;
    private Barbearia barbearia;

    public Cliente(int id, Barbearia barbearia) {
        this.id = id;
        this.barbearia = barbearia;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (barbearia.cortaCabelo(this)) {
                    break;
                }
                Thread.sleep((long) (Math.random() * 2000 + 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
