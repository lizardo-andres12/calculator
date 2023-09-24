import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    public DoublyLinkedList expression = new DoublyLinkedList();
    private ImageIcon imageIcon = new ImageIcon("C:/Users/lizar/OneDrive/Pictures/Screenshots/erick.jpg");
    public String input = "";
    private JLabel display = new JLabel("");
    private JPanel panel = new JPanel();
    private final JButton one = new JButton("1");
    private final JButton two = new JButton("2");
    private final JButton three = new JButton("3");
    private final JButton four = new JButton("4");
    private final JButton five = new JButton("5");
    private final JButton six = new JButton("6");
    private final JButton seven = new JButton("7");
    private final JButton eight = new JButton("8");
    private final JButton nine = new JButton("9");
    private final JButton zero = new JButton("0");
    private final JButton decimal = new JButton(".");
    private final JButton plusSign = new JButton("+");
    private final JButton minusSign = new JButton("-");
    private final JButton multiplicationSign = new JButton("*");
    private final JButton divisionSign = new JButton("/");
    private final JButton exponentSign = new JButton("^");
    private final JButton openParenthesis = new JButton("(");
    private final JButton closeParenthesis = new JButton(")");
    private final JButton equalsSign = new JButton("=");
    private final JButton clear = new JButton("CE");

    public Frame() {
        this.setTitle("Simple Calculator v1.0");
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setIconImage(imageIcon.getImage());

        display.setSize(400, 80);
        display.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        display.setHorizontalAlignment(0);
        this.add(display);

        panel.setSize(400, 500);
        panel.setBounds(0, 80, 390, 490);
        panel.setLayout(new GridLayout(5, 4));
        this.add(panel);

        clear.addActionListener(this);
        panel.add(clear);
        openParenthesis.addActionListener(this);
        panel.add(openParenthesis);
        closeParenthesis.addActionListener(this);
        panel.add(closeParenthesis);
        exponentSign.addActionListener(this);
        panel.add(exponentSign);
        seven.addActionListener(this);
        panel.add(seven);
        eight.addActionListener(this);
        panel.add(eight);
        nine.addActionListener(this);
        panel.add(nine);
        divisionSign.addActionListener(this);
        panel.add(divisionSign);
        four.addActionListener(this);
        panel.add(four);
        five.addActionListener(this);
        panel.add(five);
        six.addActionListener(this);
        panel.add(six);
        multiplicationSign.addActionListener(this);
        panel.add(multiplicationSign);
        one.addActionListener(this);
        panel.add(one);
        two.addActionListener(this);
        panel.add(two);
        three.addActionListener(this);
        panel.add(three);
        plusSign.addActionListener(this);
        panel.add(plusSign);
        decimal.addActionListener(this);
        panel.add(decimal);
        zero.addActionListener(this);
        panel.add(zero);
        equalsSign.addActionListener(this);
        panel.add(equalsSign);
        minusSign.addActionListener(this);
        panel.add(minusSign);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == one) {
            input+="1";
            display.setText(display.getText()+"1");
        }
        if (event.getSource() == two) {
            input+="2";
            display.setText(display.getText()+"2");
        }
        if (event.getSource() == three) {
            input+="3";
            display.setText(display.getText()+"3");
        }
        if (event.getSource() == four) {
            input+="4";
            display.setText(display.getText()+"4");
        }
        if (event.getSource() == five) {
            input+="5";
            display.setText(display.getText()+"5");
        }
        if (event.getSource() == six) {
            input+="6";
            display.setText(display.getText()+"6");
        }
        if (event.getSource() == seven) {
            input+="7";
            display.setText(display.getText()+"7");
        }
        if (event.getSource() == eight) {
            input+="8";
            display.setText(display.getText()+"8");
        }
        if (event.getSource() == nine) {
            input+="9";
            display.setText(display.getText()+"9");
        }
        if (event.getSource() == zero) {
            input+="0";
            display.setText(display.getText()+"0");
        }
        if (event.getSource() == decimal) {
            input+=".";
            display.setText(display.getText()+".");
        }
        if (event.getSource() == plusSign) {
            if (!input.isEmpty()) {
                expression.addNode(input);
                input = "";
            }
            expression.addNode("+");
            display.setText(display.getText()+"+");
        }
        if (event.getSource() == minusSign) {
            if (!input.isEmpty()) {
                expression.addNode(input);
                input = "";
            }
            expression.addNode("-");
            display.setText(display.getText()+"-");
        }
        if (event.getSource() == multiplicationSign) {
            if (!input.isEmpty()) {
                expression.addNode(input);
                input = "";
            }
            expression.addNode("*");
            display.setText(display.getText()+"*");
        }
        if (event.getSource() == divisionSign) {
            if (!input.isEmpty()) {
                expression.addNode(input);
                input = "";
            }
            expression.addNode("/");
            display.setText(display.getText()+"/");
        }
        if (event.getSource() == exponentSign) {
            if (!input.isEmpty()) {
                expression.addNode(input);
                input = "";
            }
            expression.addNode("^");
            display.setText(display.getText()+"^");
        }
        if (event.getSource() == openParenthesis) {
            if (!input.isEmpty()) {
                expression.addNode(input);
                input = "";
            }
            expression.addNode("(");
            display.setText(display.getText()+"(");
        }
        if (event.getSource() == closeParenthesis) {
            if (!input.isEmpty()) {
                expression.addNode(input);
                input = "";
            }
            expression.addNode(")");
            display.setText(display.getText()+")");
        }
        if (event.getSource() == equalsSign) {
            try {
                expression.addNode(input);
                expression.evaluate();
                display.setText(expression.head.data);
                input = expression.head.data;
            }
            catch (NumberFormatException numberFormatException) {
                String message = "Error: not a correct expression";
                display.setText(message);
            }
            catch (Exception exception) {
                String message = "Error: Logic Error";
            }
        }
        if (event.getSource() == clear) {
            display.setText("");
            input = "";
            expression.clear();
        }
    }
}
