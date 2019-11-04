package rock_paper_scissors;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AboutUI {
	JFrame jf;
	JTextArea jta;
	JButton jb, jb1;

	public void init() {
		
		jf=new JFrame();
		jf.setTitle("����");
		jf.setSize(300,300);
		jf.setResizable(false);
		
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);

		jta =new JTextArea("        ����ѧʶǳ�������Ա��������ڱ߰ٶȱ߱�д��ɵģ�ּ��ѧϰ��",5,10);
		jta.setLineWrap(true);
		jta.setEditable(false);
		//jta.append("\n���ߵ�bվ��ҳ<html><a href='https://space.bilibili.com/20837528'>���İ���</a></html>");
		
	//	jep.setText("<html><a href=https://space.bilibili.com/20837528>���İ���</a></html>");
		jf.add(jta);
		jta.setBounds(0, 0, 285, 50);
		//jb=new JButton();
		jb = new JButton("����bվ��ҳ");
		//jb.setFont(new Font("����", Font.BOLD, 15));
		jb.setBorderPainted(false);//����ӡ�߿�  
		jb.setBorder(null);//��ȥ�߿� 
		jb.setFocusPainted(false);//��ȥ����Ŀ� 
		jb.setContentAreaFilled(false);
		jb.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb.setForeground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������

				Desktop desktop = Desktop.getDesktop();   
				
				try {
					desktop.browse(new URI("https://space.bilibili.com/20837528"));
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
			}
		});
		jf.add(jb);
		jb.setBounds(5, 50, 100, 50);
		

		jb1 = new JButton("����Github��ҳ");
		//jb.setFont(new Font("����", Font.BOLD, 15));
		jb1.setBorderPainted(false);//����ӡ�߿�  
		jb1.setBorder(null);//��ȥ�߿� 
		jb1.setFocusPainted(false);//��ȥ����Ŀ� 
		jb1.setContentAreaFilled(false);
		jb1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb1.setForeground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb1.setForeground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������

				Desktop desktop = Desktop.getDesktop();   
				
				try {
					desktop.browse(new URI("https://github.com/pengxiandyou"));
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
			}
		});
		jf.add(jb1);
		jb1.setBounds(5, 100, 100, 50);
		
		
		jf.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO �Զ����ɵķ������
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO �Զ����ɵķ������
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO �Զ����ɵķ������
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO �Զ����ɵķ������
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				AllFrames.mainUI.getJf().setEnabled(true);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO �Զ����ɵķ������
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO �Զ����ɵķ������
				
			}
		});
		jf.setVisible(true);
	}

	public JFrame getJf() {
		return jf;
	}

	public void setJf(JFrame jf) {
		this.jf = jf;
	}
	

}
