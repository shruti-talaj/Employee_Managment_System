public class Main {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Employee_Managment Portal");
        System.out.println("Select the Operation you wants to perform");
        System.out.println("1.Insert ||  2.Read ||  3.Update ||  4.Delete");
        int num =sc.nextInt();

        switch (num){
            case 1:{
                System.out.println("Enter the details");
                System.out.println("Empid  || Name || Addres || Contact No. || Emailid || Salary || DeptNo.");
                int id = sc.nextInt();
                String name = sc.next();
                String add = sc.next();
                String phone = sc.next();
                String email = sc.next();
                int salary = sc.nextInt();
                int dept = sc.nextInt();
                Empinfo st = new Empinfo(id,name,add,phone,email,salary,dept);
                employee.create(st);
                System.out.println("Insertd Succesfully");
                break;

            }
            case 2:{
                System.out.println("Employees data");

                employee.readall();
                break;
            }
            case 3:{
                System.out.println("What you wants to Update");
                System.out.println("1.Name || 2.Address || 3.ContactNo. || 4.email || 5.salary || 6.DeptNo");
                int n =sc.nextInt();
                switch (n){
                    case 1:{
                        System.out.println("Enter name");
                        String name = sc.next();
                        System.out.println("Enter id");
                        int id =sc.nextInt();
                        employee.UpdateName(id,name);
                        System.out.println("Updated suceesfully");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter id");
                        int id = sc.nextInt();
                        System.out.println("Enter Address");
                        String  add =sc.next();
                        employee.UpdateAdd(id,add);
                        System.out.println("Updated suceesfully");
                        break;
                    }
                    case 3:{
                        System.out.println("Entner the ContactNo");
                        int cont = sc.nextInt();
                        System.out.println("Enter the id");
                        int id =sc.nextInt();
                        employee.UpdateContact(id,cont);
                        System.out.println("Updated suceesfully");
                        break;
                    }
                    case 4:{
                        System.out.println("Enter the email id");
                        String eamil = sc.next();
                        System.out.println("Enter the id");
                        int id =sc.nextInt();
                        employee.UpdateEmail(id,eamil);
                        System.out.println("Updated suceesfully");
                        break;
                    }
                    case 5:{
                        System.out.println("Enter the salary");
                        int sal = sc.nextInt();
                        System.out.println("Enter the id");
                        int id =sc.nextInt();
                        employee.UpdateSalary(id,sal);
                        System.out.println("Updated suceesfully");
                        break;
                    }
                    case 6:{
                        System.out.println("Enter the deptNo");
                        int dept = sc.nextInt();
                        int id =sc.nextInt();
                        employee.UpdateDept(id,dept);
                        System.out.println("Updated suceesfully");
                        break;
                    }
                }
                break;

            }
            case 4:{
                System.out.println("Enter the id of the Employee you want to delete");
                int id =sc.nextInt();
                employee.delete(id);
                System.out.println("Deleted Successfully");
            }
        }
    }
}
