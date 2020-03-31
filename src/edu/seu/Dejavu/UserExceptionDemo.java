package edu.seu.Dejavu;

class UserException extends Exception{
    String myMsg="User defined exception.";
    double myNum=4.0;
    UserException(){super("First letter shouldn't be A!");}
    UserException(String msg){super(msg);}
    public void displayMe(){System.out.println(myMsg);}
    public double myMethod(){return Math.sqrt(myNum);}
}

public class UserExceptionDemo{
    public void work(String[] args) throws UserException {
        try{
            if(args.length>1){
                throw new ArrayIndexOutOfBoundsException();
            }else if (args[0].charAt(0)=='A'){
                UserException ue=new UserException();
                System.out.println("Got ya!\n");
                throw ue;
            }
            System.out.println("Your entry is:"+args[0]);
        }
        catch (UserException ue){
            System.out.println(ue.getMessage());
            ue.displayMe();
            System.out.println(""+ue.myMethod());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You should enter only one parameter!");
        }
    }
}
