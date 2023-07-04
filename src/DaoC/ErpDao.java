package DaoC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;







import com.model.Announcement;
import com.model.Sport;
import com.model.Staff;
import com.model.Student;
import com.model.Tournament;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ErpDao 
{
	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement", "root", "");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	
	//**************************Student*************************************
	
				//****Insert****//
			
	public static int insertStudent(Student s)
	{
		int status = 0;
		try
		{
			Connection con = ErpDao.getConnection();
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into student(name,logname,logpass,standard,division,address,age,dob,gender,email) values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, s.getName());
			ps.setString(2, s.getLogname());
			ps.setString(3, s.getLogpass());
			ps.setString(4, s.getStandard());
			ps.setString(5, s.getDivision());
			ps.setString(6, s.getAddress());
			ps.setString(7, s.getAge());
			ps.setString(8, s.getDob());
			ps.setString(9, s.getGender());
			ps.setString(10,s.getEmail());
			
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	
			//*****View****//
	
	public static List<Student> ViewAllStudent()
	{
		List<Student> list = new ArrayList<Student>();
		try
		{
			Connection con = ErpDao.getConnection();
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Student s = new Student();
				s.setSid(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setLogname(rs.getString(3));
				s.setLogpass(rs.getString(4));
				s.setStandard(rs.getString(5));
				s.setDivision(rs.getString(6));
				s.setAddress(rs.getString(7));
				s.setAge(rs.getString(8));
				s.setDob(rs.getString(9));
				s.setGender(rs.getString(10));
				s.setEmail(rs.getString(11));
				
				list.add(s);
			}
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
		
			//*****Fetch ID****
	
	public static Student getStudentId(int id)
	{
		Student s = new Student();
		
		try
		{
			Connection con = ErpDao.getConnection();
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from student where sid=?");
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				s.setSid(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setLogname(rs.getString(3));
				s.setLogpass(rs.getString(4));
				s.setStandard(rs.getString(5));
				s.setDivision(rs.getString(6));
				s.setAddress(rs.getString(7));
				s.setAge(rs.getString(8));
				s.setDob(rs.getString(9));
				s.setGender(rs.getString(10));
				s.setEmail(rs.getString(11));
			}
			con.close();
		}	
		catch(Exception e)
		{
				e.printStackTrace();
		}
		return s;
	}
	
			//*****Update****
	
	 public static int updateStudent(Student s) 
	 {
			int status=0;  
	        try
	        {  
	            Connection con=ErpDao.getConnection();  
	            PreparedStatement ps=(PreparedStatement) con.prepareStatement("update student set name=?,logname=?,logpass=?,standard=?,division=?,address=?, age=?, dob=?, gender=?, email=? where sid=?");  
	          
	            ps.setString(1,s.getName());  
	            ps.setString(2,s.getLogname());  
	            ps.setString(3,s.getLogpass());  
	            ps.setString(4,s.getStandard());
	            ps.setString(5,s.getDivision());
	            ps.setString(6,s.getAddress());
	            ps.setString(7,s.getAge());
	            ps.setString(8,s.getDob());
	            ps.setString(9,s.getGender());
	            ps.setString(10,s.getEmail());
	            ps.setInt(11,s.getSid());  
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }
	        catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        }  
	          
	        return status;  
	}
	 		
	 			//*****Delete****
	 
	 public static int deleteStudent(int id) {
		 int status=0;  
	        try{  
	            Connection con=ErpDao.getConnection();  
	            PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete from student where sid=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
		
	}
	 
	
	//**************************Tournament*************************************
	 
	 				//*****Insert****
	 public static int insertTournament(Tournament t)
		{
			int status = 0;
			try
			{
				Connection con = ErpDao.getConnection();
				PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into tournament(tournamentname,startdate,location,noofstudent) values(?,?,?,?)");
				ps.setString(1, t.getTournamentname());
				ps.setString(2, t.getStartdate());
				ps.setString(3, t.getLocation());
				ps.setString(4, t.getNoofstudent());
				
				
				status = ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return status;
		}
				
	 			//*******View****
	 
		public static List<Tournament> ViewAllTournament()
		{
			List<Tournament> list = new ArrayList<Tournament>();
			try
			{
				Connection con = ErpDao.getConnection();
				PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from tournament");
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					Tournament t = new Tournament();
					t.setTournamentid(rs.getInt(1));
					t.setTournamentname(rs.getString(2));
					t.setStartdate(rs.getString(3));
					t.setLocation(rs.getString(4));
					t.setNoofstudent(rs.getString(5));
					
					
					list.add(t);
				}
			}	
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return list;
		}
				
				//*****Fetch ID*****
		
		public static Tournament getTournamentId(int id1)
		{
			Tournament t = new Tournament();
			
			try
			{
				Connection con = ErpDao.getConnection();
				PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from tournament where tournamentid=?");
				ps.setInt(1,id1);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					t.setTournamentid(rs.getInt(1));
					t.setTournamentname(rs.getString(2));
					t.setStartdate(rs.getString(3));
					t.setLocation(rs.getString(4));
					t.setNoofstudent(rs.getString(5));
					
				}
				con.close();
			}	
			catch(Exception e)
			{
					e.printStackTrace();
			}
			return t;
		}
		
					//*****Update****
		
		 public static int updateTournament(Tournament t) 
		 {
				int status=0;  
		        try
		        {  
		            Connection con=ErpDao.getConnection();  
		            PreparedStatement ps=(PreparedStatement) con.prepareStatement("update tournament set tournamentname=?,startdate=?,location=?,noofstudent=? where tournamentid=?");  
		          
		            ps.setString(1,t.getTournamentname());  
		            ps.setString(2,t.getStartdate());  
		            ps.setString(3,t.getLocation());
		            ps.setString(4,t.getNoofstudent());
		            
		            ps.setInt(5,t.getTournamentid());
		              
		              
		            status=ps.executeUpdate();  
		              
		            con.close();  
		        }
		        catch(Exception ex)
		        {
		        	ex.printStackTrace();
		        }  
		          
		        return status;  
		}
		 		//********Delete/*****
		 public static int deleteTournament(int id) {
			 int status=0;  
		        try{  
		            Connection con=ErpDao.getConnection();  
		            PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete from tournament where tournamentid=?");  
		            ps.setInt(1,id);  
		            status=ps.executeUpdate();  
		              
		            con.close();  
		        }catch(Exception e){e.printStackTrace();}  
		          
		        return status;  
			
		}
	 
	//*****************************Staff*******************
		 
		 			//Insert//
		 
		 public static int insertStaff(Staff sf)
			{
				int status = 0;
				try
				{
					Connection con = ErpDao.getConnection();
					PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into staff(name,position,phone,address,gender,age,joindate,logname,logpass,dob) values(?,?,?,?,?,?,?,?,?,?)");
					ps.setString(1, sf.getName());
					ps.setString(2, sf.getPosition());
					ps.setString(3, sf.getPhone());
					ps.setString(4, sf.getAddress());
					ps.setString(5, sf.getGender());
					ps.setString(6, sf.getAge());
					ps.setString(7, sf.getJoindate());
					ps.setString(8, sf.getLogname());
					ps.setString(9, sf.getLogpass());
					ps.setString(10,sf.getDob());
					
					status = ps.executeUpdate();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return status;
			}
		 	
		 			//View//
		 
			public static List<Staff> ViewAllStaff()
			{
				List<Staff> list = new ArrayList<Staff>();
				try
				{
					Connection con = ErpDao.getConnection();
					PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from staff");
					ResultSet rs = ps.executeQuery();
					while(rs.next())
					{
						Staff sf = new Staff();
						sf.setSid(rs.getInt(1));
						sf.setName(rs.getString(2));
						sf.setPosition(rs.getString(3));
						sf.setPhone(rs.getString(4));
						sf.setAddress(rs.getString(5));
						sf.setGender(rs.getString(6));
						sf.setAge(rs.getString(7));
						sf.setJoindate(rs.getString(8));
						sf.setLogname(rs.getString(9));
						sf.setLogpass(rs.getString(10));
						sf.setDob(rs.getString(11));
						
						list.add(sf);
					}
				}	
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return list;
			}
				
						//Fetch ID//
			
			public static Staff getStaffId(int id2)
			{
				Staff sf = new Staff();
				
				try
				{
					Connection con = ErpDao.getConnection();
					PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from staff where sid=?");
					ps.setInt(1,id2);
					
					ResultSet rs = ps.executeQuery();
					if(rs.next())
					{
						sf.setSid(rs.getInt(1));
						sf.setName(rs.getString(2));
						sf.setPosition(rs.getString(3));
						sf.setPhone(rs.getString(4));
						sf.setAddress(rs.getString(5));
						sf.setGender(rs.getString(6));
						sf.setAge(rs.getString(7));
						sf.setJoindate(rs.getString(8));
						sf.setLogname(rs.getString(9));
						sf.setLogpass(rs.getString(10));
						sf.setDob(rs.getString(11));
					}
					con.close();
				}	
				catch(Exception e)
				{
						e.printStackTrace();
				}
				return sf;
			}
			
					//***Update***//
			
			 public static int updateStaff(Staff sf) 
			 {
					int status=0;  
			        try
			        {  
			            Connection con=ErpDao.getConnection();  
			            PreparedStatement ps=(PreparedStatement) con.prepareStatement("update staff set name=?,position=?,phone=?,address=?,gender=?,age=?, joindate=?, logname=?, logpass=?, dob=? where sid=?");  
			          
			            ps.setString(1,sf.getName());  
			            ps.setString(2,sf.getPosition());  
			            ps.setString(3,sf.getPhone());  
			            ps.setString(4,sf.getAddress());
			            ps.setString(5,sf.getGender());
			            ps.setString(6,sf.getAge());
			            ps.setString(7,sf.getJoindate());
			            ps.setString(8,sf.getLogname());
			            ps.setString(9,sf.getLogpass());
			            ps.setString(10,sf.getDob());
			            ps.setInt(11,sf.getSid());  
			              
			            status=ps.executeUpdate();  
			              
			            con.close();  
			        }
			        catch(Exception ex)
			        {
			        	ex.printStackTrace();
			        }  
			          
			        return status;  
			}
			 		
			 		//*******Delete*****
			 
			 public static int deleteStaff(int id) {
				 int status=0;  
			        try{  
			            Connection con=ErpDao.getConnection();  
			            PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete from staff where sid=?");  
			            ps.setInt(1,id);  
			            status=ps.executeUpdate();  
			              
			            con.close();  
			        }catch(Exception e){e.printStackTrace();}  
			          
			        return status;  
				
			}	
			 
	//*************************Sport***********************
			 
			 		//Insert//
			 
			 public static int insertSport(Sport sp)
				{
					int status = 0;
					try
					{
						Connection con = ErpDao.getConnection();
						PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into sport(sportname) values(?)");
						ps.setString(1, sp.getSportname());
						
						
						status = ps.executeUpdate();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					return status;
				}
			 		
			 		//View//
			 
				public static List<Sport> ViewAllSport()
				{
					List<Sport> list = new ArrayList<Sport>();
					try
					{
						Connection con = ErpDao.getConnection();
						PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from sport");
						ResultSet rs = ps.executeQuery();
						while(rs.next())
						{
							Sport sp = new Sport();
							sp.setSportid(rs.getInt(1));
							sp.setSportname(rs.getString(2));
							
							
							list.add(sp);
						}
					}	
					catch(Exception e)
					{
						e.printStackTrace();
					}
					return list;
				}
				
						//Fetch Id//
				public static Sport getSportId(int id3)
				{
					Sport sp = new Sport();
					
					try
					{
						Connection con = ErpDao.getConnection();
						PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from sport where sportid=?");
						ps.setInt(1,id3);
						
						ResultSet rs = ps.executeQuery();
						if(rs.next())
						{
							sp.setSportid(rs.getInt(1));
							sp.setSportname(rs.getString(2));
							
						}
						con.close();
					}	
					catch(Exception e)
					{
							e.printStackTrace();
					}
					return sp;
				}
				
						//Update
				
				 public static int updateSport(Sport sp) 
				 {
						int status=0;  
				        try
				        {  
				            Connection con=ErpDao.getConnection();  
				            PreparedStatement ps=(PreparedStatement) con.prepareStatement("update sport set sportname=? where sportid=?");  
				          
				            ps.setString(1,sp.getSportname());
				            ps.setInt(2,sp.getSportid());
				              
				            
				              
				              
				            status=ps.executeUpdate();  
				              
				            con.close();  
				        }
				        catch(Exception ex)
				        {
				        	ex.printStackTrace();
				        }  
				          
				        return status;  
				}
				
				 		//delete//
				 
				 public static int deleteSport(int id) {
					 int status=0;  
				        try{  
				            Connection con=ErpDao.getConnection();  
				            PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete from sport where sportid=?");  
				            ps.setInt(1,id);  
				            status=ps.executeUpdate();  
				              
				            con.close();  
				        }catch(Exception e){e.printStackTrace();}  
				          
				        return status;	 
			 
			 
				 }
				 
		//******************Announcement**************************
				 
				 	
				 		//Insert//
				 public static int insertAnnouncement(Announcement an)
					{
						int status = 0;
						try
						{
							Connection con = ErpDao.getConnection();
							PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into anouncement(annname,dateofan) values(?,?)");
							ps.setString(1, an.getAnnname());
							ps.setString(2, an.getDateofan());
							
							
							status = ps.executeUpdate();
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						return status;
					}
							
				 		//View//
				 
					public static List<Announcement> ViewAllAnnouncement()
					{
						List<Announcement> list = new ArrayList<Announcement>();
						try
						{
							Connection con = ErpDao.getConnection();
							PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from anouncement");
							ResultSet rs = ps.executeQuery();
							while(rs.next())
							{
								Announcement an = new Announcement();
								an.setAnid(rs.getInt(1));
								an.setAnnname(rs.getString(2));
								an.setDateofan(rs.getString(3));
								
								
								list.add(an);
							}
						}	
						catch(Exception e)
						{
							e.printStackTrace();
						}
						return list;
					}
					
						//Fetch Id//
					
					public static Announcement getAnnouncementId(int id4)
					{
						Announcement an = new Announcement();
						
						try
						{
							Connection con = ErpDao.getConnection();
							PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from anouncement where anid=?");
							ps.setInt(1,id4);
							
							ResultSet rs = ps.executeQuery();
							if(rs.next())
							{
								an.setAnid(rs.getInt(1));
								an.setAnnname(rs.getString(2));
								an.setDateofan(rs.getString(3));
								
							}
							con.close();
						}	
						catch(Exception e)
						{
								e.printStackTrace();
						}
						return an;
					}		 
				 
						//Delete//
					
					public static int deleteAnouncement(int id) {
						 int status=0;  
					        try{  
					            Connection con=ErpDao.getConnection();  
					            PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete from anouncement where anid=?");  
					            ps.setInt(1,id);  
					            status=ps.executeUpdate();  
					              
					            con.close();  
					        }catch(Exception e){e.printStackTrace();}  
					          
					        return status;	 
				 
				 
					 }
				 
				 

}
