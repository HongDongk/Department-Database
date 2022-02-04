package database.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class main {
   
   String driver = "com.mysql.cj.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/dmp";
   String user = "root";
   String pass = "winner1201!";
   
   public main() {

         try {
            Class.forName(driver);
            System.out.println("mysql����̹� ����");
         } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("mysql����̹� ����");
         }

      }

      /////////////////////// Ŀ�ؼǿ���
      public Connection getConnection() {
         Connection conn = null;

         try {
            conn = DriverManager.getConnection(url, user, pass);

         } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("db��������");
         }

         return conn;
      }
      

     
      public void first() {
            System.out.println("�����̸�\t����ī�װ�\t�����̸�\t������\t��������\t������\tVIP��\t�����\t������\t��翩��");
            System.out.println("---------------------------------------------------------------------------------");

            String sql = "select * from Store"; 

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            conn = getConnection();
            try {
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);

               while (rs.next()) {
                  System.out.println(rs.getString("store_name") + "\t" + rs.getString("store_category") + "\t" + "\t"  + rs.getString("store_manager_name") + "\t"
                        + rs.getString("store_staff") + "\t" + rs.getString("store_floor")+ "\t" + rs.getInt("store_monthlysales") + "\t" + rs.getString("store_vip") + "\t" + rs.getInt("store_contractdate") + "\t" + rs.getInt("store_expirationdate") + "\t" + rs.getString("store_event"));

               }
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } finally {
               try {
                  rs.close();
                  stmt.close();
                  conn.close();
               } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }

            }

         }
      
       
      public void second() {
            System.out.println("�����̸�\t��������\t��������\t�������\t�����μ�");
            System.out.println("---------------------------------------------------------------------------------");

            String sql = "select * from worker"; 

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            conn = getConnection();
            try {
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);

               while (rs.next()) {
                  System.out.println(rs.getString("worker_name") + "\t" + rs.getString("worker_sex") + "\t" + rs.getString("worker_age") + "\t"
                           + rs.getString("worker_position") + "\t" + rs.getString("worker_place") + "\t");

               } 
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } finally {
               try {
                  rs.close();
                  stmt.close();
                  conn.close();
               } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }

            }

         }
      
      
      public void third() {
            System.out.println("VIP�̸�\t����\t����\t����\tVIP�������\t��ȣ����");
            System.out.println("---------------------------------------------------------------------------------");

            String sql = "select * from vip"; 

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            conn = getConnection();
            try {
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);

               while (rs.next()) {
                  System.out.println(rs.getString("VIP_name") + "\t" + rs.getString("VIP_gender") + "\t" + rs.getString("VIP_age") + "\t"
                        + rs.getString("VIP_job") + "\t" + rs.getString("VIP_worker") + "\t" + "\t" + rs.getString("VIP_prefer") + "\t");

               } 
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } finally {
               try {
                  rs.close();
                  stmt.close();
                  conn.close();
               } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }

            }

         }
      
      
      public void fourth() {
              System.out.println("��¥\t�湮�ڼ�\t������\t�����\t�̺�Ʈ���\t�Ѹ���");
              System.out.println("---------------------------------------------------------------------------------");

            String sql = "select * from sales"; 

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            conn = getConnection();
            try {
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);

               while (rs.next()) {
                  System.out.println(rs.getString("sales_date") + "\t" + rs.getString("number_of_visitor") + "\t" + rs.getString("maintain_cost") + "\t"
                        + rs.getString("ad_cost") + "\t" + rs.getString("event_cost") + "\t" + rs.getInt("total_sales"));

               } 
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } finally {
               try {
                  rs.close();
                  stmt.close();
                  conn.close();
               } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }

            }

         }

      
      public void fifth() {
            System.out.println("����̸�\t\t������\t������\t������̸�\t����\t\t����\t\t\t�¿������ο���");
            System.out.println("---------------------------------------------------------------------------------");

            String sql = "select * from event"; 

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            conn = getConnection();
            try {
               stmt = conn.createStatement();
               rs = stmt.executeQuery(sql);

               while (rs.next()) {
                  System.out.println(rs.getString("event_name") + "\t" + rs.getString("event_date") + "\t" + rs.getString("event_deadline") + "\t"
                           + rs.getString("event_manager") + "\t" + rs.getString("event_subject") + "\t" + "\t" + rs.getString("event_topic") + "\t" + "\t" + "\t" + rs.getString("event_on_offline") + "\t" );
                  
               } 
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } finally {
               try {
                  rs.close();
                  stmt.close();
                  conn.close();
               } catch (SQLException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }

            }

         }
      
      
      
      

      
      
    public static void main(String[] args) {
   

            main mdb = new main();

            Scanner sc = new Scanner(System.in);
            int n = 0;

            while (true) {
               System.out.println("���ϴ� ��ȭ�������� �����ϼ���!! 1.��ȭ������ 2.��ȭ������ 3.��ȭ��VIP 4.��ȭ������ 5.��ȭ���̺�Ʈ 0.���α׷�����" );
               n = Integer.parseInt(sc.nextLine());

               if (n == 1)
                  mdb.first();
               else if (n == 2)
                 mdb.second();
               else if (n == 3)
                 mdb.third();
               else if(n==4)
                 mdb.fourth();
               else if(n==5)
                 mdb.fifth();
               else if (n == 0) {
                     System.out.println("���α׷�����");
                     break;
                     }
            }

         }

      }
   
   
   