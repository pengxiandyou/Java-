package rock_paper_scissors;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class ChangeBackground {
	JFrame jf;
	JPanel jp1;
	MyPanel mjp1;
	JButton jb0,jb5,jb6;
	String PATH=null;
	public void init(String path) {
		jf=new JFrame();
		jf.setSize(600+8+8, 500+31+8-40);
		jf.setResizable(false);//���ô˴����Ƿ�����û�������С��
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jf.setUndecorated(true);
		jp1=new JPanel();
		jp1.setLayout(null);
		String PATH=path;
		for(int i=0;i<5;i++) {
			if(i==0) {jb0=new JButton("Ĭ��");}else {jb0=new JButton("����"+(i));}
			int j=i;
			
			jb0.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO �Զ����ɵķ������
					
						MyPanel.path=PATH+"\\����"+j+".jpg";
					mjp1.repaint();
				}
			});
			jp1.add(jb0);
			jb0.setBounds(0,i*100,190,100);
		}
		
		mjp1=new MyPanel();
		
		jf.add(mjp1);
		mjp1.setBounds(200, 0, 400, 400);
		jf.add(jp1);
		jp1.setBounds(0, 0, 190, 500);
		
		jb5=new JButton("��");
		jb5.addMouseListener(new MouseAdapter() {		
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO �Զ����ɵķ������
						FileSelector fileSelector=new FileSelector();
						fileSelector.init();
						jf.setEnabled(false);
						
						
						MyPanel.path=fileSelector.getPath();;
						mjp1.repaint();
						
					}
				});
		jf.add(jb5);
		jb5.setBounds(200,430,100,40);
		
		jb6=new JButton("ȷ��");//����Ҫ����ҳ������Ϊ�ɶ�
		jb6.addMouseListener(new MouseAdapter() {		
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				AllFrames.mainUI.getJf().setEnabled(true);
				AllFrames.mainUI.getJf().repaint();
				jf.dispose();
			}
		});
		jf.add(jb6);
		jb6.setBounds(500,430,100,40);
		jf.setVisible(true);
	}
	public JFrame getJf() {
		return jf;
	}
	public void setJf(JFrame jf) {
		this.jf = jf;
	}
	public String getPath() {
		return PATH;
	}
	public void setPath(String path) {
		this.PATH = path;
	}
	
}
