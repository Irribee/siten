import java.util.ArrayList;

//
public class SimpleAnimation {
    public static void main(String[] args) {
        String[] number = {"111", "222", "333", "444", "555", "666", "777", "888", "999"};
        String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        int region = (int) Math.random() * 197;

        int numberLength = number.length;
        int letterLength = letter.length;

        int randNumber = (int) Math.random() * numberLength;
        int randLetter = (int) Math.random() * letterLength;
        String randRegion=Integer.toString(region);

        ArrayList<String> autoNumber = new ArrayList<>();
        autoNumber.add(letter[randLetter]);
        autoNumber.add(number[randNumber]);
        autoNumber.add(letter[randLetter]);
        autoNumber.add(letter[randLetter]);
        autoNumber.add(randRegion);
        System.out.println(autoNumber);
    }
}
//import javax.swing.*;
//import java.awt.*;
//
//    public class SimpleAnimation {
//
//        int x = 70;
//        int y = 70;
//
//        public static void main(String[] args) {
//            SimpleAnimation gui = new SimpleAnimation();
//            gui.go();
//        }
//
//        public void go() {
//            JFrame frame = new JFrame();
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            MyDrawPanel drawPanel = new MyDrawPanel();
//
//            frame.getContentPane().add(drawPanel);
//            frame.setSize(300, 300);
//            frame.setVisible(true);
//
//            // Repeat this 130 times
//            for (int i = 0; i <130; i++) {
//                x++; // increment the x and y coordinates
//                y++;
//
//                drawPanel.repaint();
//
//                try {
//                    Thread.sleep(50);
//                } catch (Exception ex) { }
//            }
//        } // close go() method
//
//        class MyDrawPanel extends JPanel {
//            public void paintComponent(Graphics g) {
//                g.setColor(Color.white);
//                g.fillRect(0,0,this.getWidth(), this.getHeight());
//                g.setColor(Color.green);
//                g.fillOval(x, y, 40, 40);
//            }
//        }
//    }
