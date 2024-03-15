package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculatorwind {


	private void adicaoMouseReleased(MouseEvent e) {
		int x, y;
		x=Integer.parseInt(n1.getText());
		y=Integer.parseInt(n2.getText());
		
		r.setText((x+y)+"");
		
	}

	private void subtracaoMouseReleased(MouseEvent e) {
		int x, y;
		x=Integer.parseInt(n1.getText());
		y=Integer.parseInt(n2.getText());
		
		r.setText((x-y)+"");
	}

	private void multiplicarMouseReleased(MouseEvent e) {
		int x, y;
		x=Integer.parseInt(n1.getText());
		y=Integer.parseInt(n2.getText());
		
		r.setText((x*y)+"");
	}

	private void divisaoMouseReleased(MouseEvent e) {
		int x, y;
		x=Integer.parseInt(n1.getText());
		y=Integer.parseInt(n2.getText());
		
		r.setText((x/y)+"");
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Elyas
		n1 = new JTextField();
		n2 = new JTextField();
		label1 = new JLabel();
		r = new JTextField();
		adicao = new JButton();
		subtracao = new JButton();
		multiplicar = new JButton();
		divisao = new JButton();

		//======== this ========
		setMinimumSize(new Dimension(300, 140));
		var contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.add(n1);
		n1.setBounds(10, 25, 85, n1.getPreferredSize().height);
		contentPane.add(n2);
		n2.setBounds(105, 25, 80, n2.getPreferredSize().height);

		//---- label1 ----
		label1.setText("=");
		contentPane.add(label1);
		label1.setBounds(190, 30, 20, label1.getPreferredSize().height);
		contentPane.add(r);
		r.setBounds(205, 25, 70, r.getPreferredSize().height);

		//---- adicao ----
		adicao.setText("+");
		adicao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				adicaoMouseReleased(e);
			}
		});
		contentPane.add(adicao);
		adicao.setBounds(10, 55, 55, adicao.getPreferredSize().height);

		//---- subtracao ----
		subtracao.setText("-");
		subtracao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				subtracaoMouseReleased(e);
			}
		});
		contentPane.add(subtracao);
		subtracao.setBounds(85, 55, 50, subtracao.getPreferredSize().height);

		//---- multiplicar ----
		multiplicar.setText("*");
		multiplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				multiplicarMouseReleased(e);
			}
		});
		contentPane.add(multiplicar);
		multiplicar.setBounds(155, 55, 55, multiplicar.getPreferredSize().height);

		//---- divisao ----
		divisao.setText("/");
		divisao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				divisaoMouseReleased(e);
			}
		});
		contentPane.add(divisao);
		divisao.setBounds(225, 55, 52, divisao.getPreferredSize().height);

		{
			// compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Elyas
	private JTextField n1;
	private JTextField n2;
	private JLabel label1;
	private JTextField r;
	private JButton adicao;
	private JButton subtracao;
	private JButton multiplicar;
	private JButton divisao;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
