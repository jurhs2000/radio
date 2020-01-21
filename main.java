import java.awt.EventQueue;

class main {
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run() {
				try {
                    RadioView window = new RadioView();
                    window.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
        });
    }
}