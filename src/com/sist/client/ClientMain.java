package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClientMain extends JFrame implements ActionListener{
	public Login lg=new Login();
	public MenuPanel mp=new MenuPanel();
	public ControllerPanel cp=new ControllerPanel();
	public ClientMain() {
		// 배치 
		setLayout(null);
		mp.setBounds(150, 15, 600, 25);
		add(mp);
		cp.setBounds(0, 45, 800, 550);
		add("North",mp);
		add("Center",cp);
		add("Center",lg);
		
		// 윈도우 크기
		setSize(800,600);
		setVisible(true);
		
		// 윈도우 크기 고정 
		setResizable(false); 
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x 버튼 클릭시 메모리 회수 => 종료
		
		mp.b1.addActionListener(this); // b1 버튼을 클릭하면 => actionPerformed를 호출
		mp.b2.addActionListener(this);
		lg.b1.addActionListener(this);
		//mp.b6.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		}catch(Exception ex) {}
		new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(mp.b4==e.getSource()) { // 메뉴 1번 버튼 클릭
			cp.card.show(cp, "LOGIN");
		}
		else if(mp.b2==e.getSource()) { // 메뉴 2번 버튼 클릭
			cp.card.show(cp, "FIND");
		}
		/*else if(mp.b6==e.getSource()) { // 메뉴 2번 버튼 클릭
			JOptionPane.showMessageDialog(this, "프로그램 종료");
			System.exit(0);
		}*/
	}

}

