package com.practice;
/**
 * ������Դ
 * @author ������
 *
 */
public class Web12306 implements Runnable {

	//Ʊ��
	private int ticketNums=99;
	@Override
	public void run() {
		 while(true) {
			 if (ticketNums<0) {
					break;
				}
			 try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName()+"--->"+ticketNums--);
		 }
		
	}
public static void main(String[] args) {
	//һ����Դ
	Web12306 web=new Web12306();
	 System.out.println(Thread.currentThread().getName());
	//�������
	new Thread(web,"����").start();
	new Thread(web,"��ũ").start();
	new Thread(web,"���").start();;

}
}
