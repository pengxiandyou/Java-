package rock_paper_scissors;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainUI {
	
	
	JFrame jf;
	JButton jb1,jb2,jb3,jb4;
	MyPanel jp;
	private void init(String path) {
		jf=new JFrame();//�����ϱ��У����λ�á�
		jp=new MyPanel();
		if(path==null) {
		File directory = new File(".");
		try {
			System.out.println(directory.getCanonicalPath()); 
			path=directory.getCanonicalPath();
			MyPanel.path=path +"\\����0.jpg";
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		}else {
			MyPanel.path=path;
		}
		
		
		//jp.setOpaque(false);��jpanel����Ϊ͸������ʾjfreame�ı�����ɫ
		jp.setSize(400+8, 400+31);
		jf.setTitle("����ʯͷ��");
		jf.setSize(400+8, 400+31);
		jf.setResizable(false);//���ô˴����Ƿ�����û�������С��
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * :��contentPane����ɫ����Ϊ����Ҫ����ɫ�������Ƕ�JFrame�������ã�

			���Ĵ��룺this.getContentPane().setBackground(Color.red);//����contentPaneΪ��ɫ
		 */
		//jf.getContentPane().setBackground(Color.red);
		
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jp.setLayout(null);//jpanelΪ��ʽ���ָ�Ϊ��
		jb1 = new JButton("��ʼ��Ϸ");
		jb1.setFont(new Font("�����п�", Font.BOLD, 30));
	//	jb1.setSize(100, 50);
		jb1.setBorderPainted(false);//����ӡ�߿�  
		jb1.setBorder(null);//��ȥ�߿� 
		jb1.setFocusPainted(false);//��ȥ����Ŀ� 
		jb1.setContentAreaFilled(false);
		jb1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb1.setFont(new Font("�����п�", Font.BOLD, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb1.setBounds(115, 50, 170, 50);
				jb1.setFont(new Font("�����п�", Font.BOLD, 40));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				AllFrames.mainUI.getJf().setVisible(false);
				GameUI gameUI =new GameUI();
				gameUI.init();
			}
		});
		
		jb2 = new JButton("�˳���Ϸ");
		jb2.setFont(new Font("�����п�", Font.BOLD, 30));
	//	jb2.setSize(100, 50);
		jb2.setBorderPainted(false);//����ӡ�߿� 
		jb2.setBorder(null);//��ȥ�߿� 
		jb2.setFocusPainted(false);//��ȥ����Ŀ� 
		jb2.setContentAreaFilled(false);
		jb2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb2.setFont(new Font("�����п�", Font.BOLD, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb2.setBounds(115, 150, 170, 50);
				jb2.setFont(new Font("�����п�", Font.BOLD, 40));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
		});
		
		jb3 = new JButton("��������");
		jb3.setFont(new Font("�����п�", Font.BOLD, 30));
		jb3.setBorderPainted(false);//����ӡ�߿�  
		jb3.setBorder(null);//��ȥ�߿� 
		jb3.setFocusPainted(false);//��ȥ����Ŀ� 
		jb3.setContentAreaFilled(false);
		jb3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb3.setFont(new Font("�����п�", Font.BOLD, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb3.setBounds(115, 250, 170, 50);
				jb3.setFont(new Font("�����п�", Font.BOLD, 40));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				AllFrames.mainUI.getJf().setEnabled(false);
				ChangeBackground changeBackground =new ChangeBackground();
				AllFrames.changeBackground=changeBackground;
				File directory = new File(".");
				try {
					changeBackground.init( directory.getCanonicalPath());
					
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				

				
				
			}
		});
		
		jb4 = new JButton("��       ��");
		jb4.setFont(new Font("�����п�", Font.BOLD, 30));
		jb4.setBorderPainted(false);//����ӡ�߿�  
		jb4.setBorder(null);//��ȥ�߿� 
		jb4.setFocusPainted(false);//��ȥ����Ŀ� 
		jb4.setContentAreaFilled(false);
		jb4.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb4.setFont(new Font("�����п�", Font.BOLD, 30));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jb4.setBounds(115, 350, 170, 50);
				jb4.setFont(new Font("�����п�", Font.BOLD, 40));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				jf.setEnabled(false);
				AboutUI aboutUI=new AboutUI();
				aboutUI.init();
			}
		});
		
		jp.add(jb1);
		jb1.setBounds(125, 50, 150, 50);
		jp.add(jb2);
		jb2.setBounds(125, 150, 150, 50);
		jp.add(jb3);
		jb3.setBounds(125, 250, 150, 50);
		jp.add(jb4);
		jb4.setBounds(125, 350, 150, 50);
		
		jf.add(jp);
		jf.setVisible(true);//��������˼��˵����ģ���Ѿ�������ˣ�����JVM���Ը�������ģ��ִ��paint������ʼ��ͼ����ʾ����Ļ���ˣ���������ʾͼ�Σ����ǿ������п�ʼ��ͼ�ˡ�
		jf.repaint();
		

 
	}
	

	public JFrame getJf() {
		return jf;
	}


	public void setJf(JFrame jf) {
		this.jf = jf;
	}


	public static void main(String[] args) {
		String path=Configuration.getPath();

		
		// TODO �Զ����ɵķ������
		MainUI mainUI =new MainUI();
		mainUI.init(path);
		AllFrames.mainUI=mainUI;
//		System.out.println(System.getProperty("java.class.path"));
//		System.out.println(System.getProperty("usr.dir"));
	
//		System.out.println(directory.getAbsolutePath());
//		System.out.println(	directory.getPath());
	

	;
		
	}

}
