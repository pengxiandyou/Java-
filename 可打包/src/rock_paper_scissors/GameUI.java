package rock_paper_scissors;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GameUI {
	JFrame jf;
	JButton jb,jb1,jb2,jb3;
	JTextArea jta;
	int 	returnNUM=0;
	static String PATH;
	public void init() {
		jf=new JFrame();
		
		File directory = new File(".");
		try {
			System.out.println(directory.getCanonicalPath()); 
			PATH = directory.getCanonicalPath();
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		//jp.setSize(200+8+8, 200+31+8);
		jf.setTitle("������Ϸ");
		jf.setSize(217+8+8, 250+31+8);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		for(int i=1;i<=3;i++) {
			jb=new JButton();final int j=i;
			jb.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String path=PATH;
					// TODO �Զ����ɵķ������
					jb1.setIcon(new ImageIcon(path+"\\"+j+".png"));
					returnNUM=AI.ai(j);
					jb2.setIcon(new ImageIcon(PATH+"\\"+returnNUM+".png"));
					jta.setText("Ӯ��"+AI.winNUM+"��     ƽ��"+AI.drawNUM+"��      �䣺"+AI.lostNUM+"��");
					jf.repaint();
				}
			});
			jb.setBorderPainted(false);//����ӡ�߿�  
			jb.setBorder(null);//��ȥ�߿� 
			jb.setFocusPainted(false);//��ȥ����Ŀ� 
			jb.setContentAreaFilled(false);
			jb.setIcon(new ImageIcon(getClass().getResource(i+".png")));
			jf.add(jb);
			jb.setBounds(0, (i-1)*65, 73, 65);
			
		}
		jb1=new JButton();
		jb1.setBorderPainted(false);//����ӡ�߿�  
		jb1.setBorder(null);//��ȥ�߿� 
		jb1.setFocusPainted(false);//��ȥ����Ŀ� 
		jb1.setContentAreaFilled(false);
		//jb1.setIcon(new ImageIcon());
		jf.add(jb1);
		jb1.setBounds(73, 65, 73, 65);
		
		jb2=new JButton();//ai��ȭ
		jb2.setBorderPainted(false);//����ӡ�߿�  
		jb2.setBorder(null);//��ȥ�߿� 
		jb2.setFocusPainted(false);//��ȥ����Ŀ� 
		jb2.setContentAreaFilled(false);
		
		jf.add(jb2);
		jb2.setBounds(145, 65, 73, 65);
		
		jb3=new JButton("������Ϸ");
		jb3.setBorderPainted(false);
		jb3.setBorder(null);
		jb3.setFocusable(false);
		jb3.setContentAreaFilled(false);
		jb3.setFont(new Font("�����п�", Font.BOLD, 20));
		jb3.addMouseListener(new MouseAdapter(){
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb3.setForeground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb3.setForeground(Color.blue);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				AllFrames.mainUI.getJf().setVisible(true);
				closeAction();
				jf.dispose();
			}
		});
		jf.add(jb3);
		jb3.setBounds(60, 200, 100, 40);
		
		jta =new JTextArea("Ӯ��  ƽ�� �䣺 ");
		jta.setLineWrap(true);
		jta.setEditable(false);
		jf.add(jta);
		jta.setBounds(73,0,140,65);
		
		jf.addWindowListener(new WindowAdapter() {
			
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				AllFrames.mainUI.getJf().setVisible(true);
				closeAction();
				jf.dispose();
			}
		
		});
		jf.setVisible(true);
	}
public void closeAction() {
	AI.drawNUM=AI.lostNUM=AI.winNUM=0;
	
}
}
