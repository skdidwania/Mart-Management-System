import java.util.*;
import java.io.*;
class Westside
{
 double cost=0;
 double count=0.0;
 double s=100.0;
 int n=100,z=0;
 double disc=0;
 String name[]=new String[n];
 double price[]=new double[n];
 public static void main(String args[])throws IOException
 {
      BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
      double billamt=0;         
      String st;
      while(true)//loop runs as long as condition is stisfied i.e No
      {
          System.out.println("************************************************************");
          System.out.println("****************WELCOME TO THE WESTSIDE*********************!!!");
          System.out.println("************************************************************");
          System.out.println("The Clothing store where all your needs for clothes and a little bit of accessories are fulfilled!!!");
          System.out.println("If you are in mood of shopping then....YOU ARE IN RIGHT PLACE!");
          Westside obj=new Westside();//Creating object of class
          do
          {
              System.out.println("We allow our customers to shop conveniently and provide them a wide variety of choices to choose from.");
              System.out.println("The choice are \n 1.Women's Wear");
              System.out.println(" 2.Men's Wear \n 3.Surprise Section! \n 4.Kid's Wear \n 5.Accessories \n 6.Shoes");
              System.out.println("Enter your choice");
              int c=Integer.parseInt(std.readLine());
              switch(c)
              {
                  case 1:   obj.Women();break;
                  case 2:   obj.Men();break;
                  case 3:   obj.Surprise();break;
                  case 4:   obj.Kids();break;
                  case 5:   obj.Accessories();break;
                  case 6:   obj.Shoes();break;
                  default: System.out.println("Please check your Input");
                }
                System.out.println("Please type 'stop' if you want to stop");
                System.out.println("Type anything else if u want to continue shopping");
                st=std.readLine();
            }
            while(!(st.equalsIgnoreCase("stop")));
            System.out.println("Your Bill:");
            System.out.println("Sl.no \t Item name \t\t\t\t Cost of the Item");
            for(int i=0;i<obj.z;i++)
            {
                System.out.println(i+1+"\t"+obj.name[i]+"\t\t\t\t"+"Rs"+obj.price[i]);
            }
            billamt=obj.cost+billamt;
            System.out.println("Total cost to be paid=Rs"+billamt);
            System.out.println("Hope you enjoyed shopping!and please do come back soon!");
            System.out.println("Are there any more customers");
            System.out.println("Enter No if there are no more customers");
            String str=std.readLine();
            if(str.equalsIgnoreCase("No"))
            break;
        }//end of while
    }//end of function
        public void Women()throws IOException
        {
            BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to the Women's clothing section !!!");
            System.out.println("We provide a wide range of selections.So");
            System.out.println("kindly enter the numbers as given in the menu");
            System.out.println("Enter 1.for Ethnic Wear 2.for Casual Wear");
            System.out.println("3.for Formal Wear 4.for Western Wear and 5.for Party Wear");
            System.out.println("WE are extremely delighted to announce that");
            System.out.println("we provide 15% discount in the Casual Wear section and 25% discount on");
            System.out.println("all sections in the Party Wear!");
            int chwo=Integer.parseInt(std.readLine());
            switch(chwo)
            {
                case 1:
                System.out.println("This is the Ethnic");
                System.out.println("section and we are very glad to announce that the latest designs have just come in!!!");
                System.out.println("The Ethnic section provides u with its own varieties.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l),Extra Large(xl).");
                System.out.println("Please enter the number according to ur choice");
                System.out.println("Enter 1.for Saree");
                System.out.println("2.for Pattiyallas 3.for Chuddidhars 4.for Salwar Kameez ");
                System.out.println("5.for Kurtis and 6.for Ghagras");
                int num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Saree";
                    price[z]=900;
                    z++;
                    System.out.println("The cost of your choice is Rs900");
                    cost=cost+900;
                }
                else if(num==2)
                {
                    name[z]="Pattiyallas";
                    price[z]=500;
                    z++;
                    System.out.println("The cost of your choice is Rs500");
                    cost=cost+500;
                }
                else if(num==3)
                {
                    name[z]="Chuddidhars";
                    price[z]=400;
                    z++;
                    System.out.println("The cost of your choice is Rs400");
                    cost=cost+400;
                }
                else if(num==4)
                {
                    name[z]="Salwar Kameez";
                    price[z]=650;
                    z++;
                    System.out.println("The cost of your choice is Rs 650");
                    cost=cost+650;
                }
                else if(num==5)
                {
                    name[z]="Kurtis";
                    price[z]=150;
                    z++;
                    System.out.println("The cost of ur choice is Rs150");
                    cost=cost+150;
                }
                else if(num==6)
                {
                    name[z]="Ghagras";
                    price[z]=550;
                    z++;
                    System.out.println("The cost of ur choice is Rs550");
                    cost=cost+550;
                }
                else
                System.out.println("Please check your input");
                break;
                case 2:
                System.out.println("This is the Casual Wear");
                System.out.println("section and we are very glad to announce that we have recieved the latest designs!!!");
                System.out.println("The Casual Wear provides u with wide varieties.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l),Extra Large(xl).");
                System.out.println("Please enter the number according to ur choice");
                System.out.println("Enter 1.for Casual Pants");
                System.out.println("2.for Casual Shirts/t-Shirts 3.for Casual Skirts 4.for Sweaters/Jackets");
                System.out.println(" and 5.for Dresses");
                num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    disc=599-(0.15*599);
                    name[z]="Casual Pants";
                    price[z]=disc;
                    z++;
                    count=count+disc;
                    System.out.println("The cost for your choice is Rs.599 but after discount it is Rs"+disc);
                }
                else if(num==2)
                {
                    disc=399-(0.15*399);
                    name[z]="Casual Shirts/T-Shirts";
                    price[z]=disc;
                    z++;
                    cost=cost+disc;
                    System.out.println("The cost for your choice is Rs399 but after discount it is Rs"+disc);
                }
                else if(num==3)
                {
                    disc=499-(0.15*499);
                    name[z]="Casual Skirts";
                    price[z]=disc;
                    z++;
                    cost=cost+disc;
                    System.out.println("The cost for your choice is Rs499 but after discount it is Rs"+disc);
                }
                else if(num==4)
                {
                    disc=299-(0.15*299);
                    name[z]="Sweater/Jackets";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost of your choice is Rs299 but after discount it is Rs"+disc);
                    cost=cost+disc;
                }
                else if(num==5)
                {
                    disc=750-(0.15*750);
                    name[z]="Dresses";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost of your choice is Rs750 but after discount it is Rs"+disc);
                    cost=cost+disc;
                }
                else
                System.out.println("Please check your input");
                break;
                case 3:
                System.out.println("This is the Formal Wear");
                System.out.println("section and we are very glad to announce that we have recieved the designs");
                System.out.println("The Formal Wear provides u with wide varieties.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l),Extra Large(xl).");
                System.out.println("Please enter the number according to ur choice");
                System.out.println("Enter 1.for Formal Pants");
                System.out.println("2.for Formal Shirts/T-Shirts 3.for Formal Skirts 4.for Coats");
                 num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Formal Pants";
                    price[z]=599;
                    z++;
                    System.out.println("The cost for your choice is Rs.599");
                    count=count+599;
                }
                else if(num==2)
                {
                    name[z]="Formal Shirts/T-Shirts";
                    price[z]=399;
                    z++;
                    System.out.println("The cost for your choice is Rs399");
                    cost=cost+399;
                }
                else if(num==3)
                {
                    name[z]="Formal Skirts";
                    price[z]=499;
                    z++;
                    System.out.println("The cost for your choice is Rs499");
                    cost=cost+499;
                }
                else if(num==4)
                {
                    name[z]="Coats";
                    price[z]=350;
                    z++;
                    System.out.println("The cost of your choice is Rs350");
                    cost=cost+350;
                }
                else
                System.out.println("Please check your input");
                break;
                case 4:
                System.out.println("This is the Western Wear");
                System.out.println("section and we are very glad to announce that we have recieved the latest designs");
                System.out.println("The Western Wear provides u with wide varieties from the Western sides itself.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l),Extra Large(xl).");
                System.out.println("Please enter the number according to ur choice");
                System.out.println("Enter 1.for Jeans(Denim)");
                System.out.println("2.for Fancy Tops(Sleeveless,Halter necked,Full sleeves etc.");
                num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Jeans(Denim)";
                    price[z]=299;
                    z++;
                    System.out.println("The cost for your choice is Rs.299");
                    count=count+299;
                }
                else if(num==2)
                {
                    name[z]="Fancy Tops(Sleeveless,Halter necked,Full sleeves etc.";
                    price[z]=199;
                    z++;
                    System.out.println("The cost for your choice is Rs199");
                    cost=cost+199;
                }
                else
                System.out.println("Please check your input");
                break;
                case 5:
                System.out.println("This is the Party Wear");
                System.out.println("The Party Wear provides u with amazing varieties of choices to choose from.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l),Extra Large(xl).");
                System.out.println("Please enter the number according to ur choice");
                System.out.println("Enter 1.for Cocktail Dresses");
                System.out.println("2.for Disco Dresses 3.for Strapless Dresses");
                num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    disc=1000-(0.25*1000);
                    count=count+disc;
                    name[z]="Cocktail Dresses";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost for your choice is Rs.1000 but after discount it is Rs"+cost);
                 }
                else if(num==2)
                {
                    disc=1500-(0.25*1500);
                    cost=cost+disc;
                    name[z]="Disco Dresses";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost for your choice is Rs1500 but after discount it is Rs"+cost);
                 }
                else if(num==3)
                {
                    disc=2500-(0.25*2500);
                    cost=cost+disc;
                    name[z]="Strapless Dresses";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost for your choice is Rs2500 but after discount it is Rs"+cost);
                 }
                else
                System.out.println("Please check your input");
                break;
                default:
                System.out.println("Please check your Input");
            }
        }//end of function Women
        public void Men()throws IOException
        {
            BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to the Men's clothing section !!!");
            System.out.println("We provide a wide range of selections.");
            System.out.println("Kindly enter the numbers as given in the menu");
            System.out.println("Enter 1.for Ethnic Wear 2.for Casual Wear");
            System.out.println("3.for Formal Wear 4.for Western Wear and 5.for Party Wear");
            System.out.println("We are extremely delighted to announce that");
            System.out.println("we provide 20% discount on all sections in the Casual Wear! and 25% discount on");
            System.out.println("Formal Wear!");
            int chwo=Integer.parseInt(std.readLine());
            switch(chwo)
            {
                case 1:
                System.out.println("This is the Ethnic");
                System.out.println("section and we are very glad to announce that the latest designs have just come in!!!");
                System.out.println("The Ethnic section provides u with its own varieties.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l),Extra Large(xl).");
                System.out.println("Please enter the number according to ur choice");
                System.out.println("Enter 1.for Kurtas");
                System.out.println("2.for Traditional Sherwanis 3.for Jodhpuri Suit 4.for Kurta Pyjama ");
                int num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Kurtas";
                    price[z]=699;
                    z++;
                    System.out.println("The cost of your choice is Rs699");
                    cost=cost+699;
                }
                else if(num==2)
                {
                    name[z]="Traditional Sherwanis";
                    price[z]=1999;
                    z++;
                    System.out.println("The cost of your choice is Rs1999");
                    cost=cost+1999;
                }
                else if(num==3)
                {
                    name[z]="Jodhpuri Suit";
                    price[z]=2999;
                    z++;
                    System.out.println("The cost of your choice is Rs2999");
                    cost=cost+2999;
                }
                else if(num==4)
                {
                    name[z]="Kurta Pyjama";
                    price[z]=1750;
                    z++;
                    System.out.println("The cost of your choice is Rs1750");
                    cost=cost+1750;
                }
                else
                System.out.println("Please check your input");
                break;
                case 2:
                System.out.println("This is the Casual Wear");
                System.out.println("section and we are very glad to announce that we have recieved the latest designs!!!");
                System.out.println("The Casual Wear provides u with wide varieties.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l),Extra Large(xl).");
                System.out.println("Please enter the number according to ur choice");
                System.out.println("Enter 1.for Casual Pants");
                System.out.println("2.for Casual Shirts 3.for Casual T-Shirts 4.for Sweaters/Jackets");
                System.out.println(" and 5.for Trousers/Shorts");
                num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    disc=1000-(0.20*1000);
                    name[z]="Casual Pants";
                    price[z]=disc;
                    z++;
                    count=count+disc;
                    System.out.println("The cost for your choice is Rs.1000 but after discount it is Rs"+disc);
                }
                else if(num==2)
                {
                    disc=750-(0.20*750);
                    name[z]="Casual Shirts";
                    price[z]=disc;
                    z++;
                    cost=cost+disc;
                    System.out.println("The cost for your choice is Rs750 but after discount it is Rs"+disc);
                }
                else if(num==3)
                {
                    disc=800-(0.20*800);
                    name[z]="Casual T-Shirts";
                    price[z]=disc;
                    z++;
                    cost=cost+disc;
                    System.out.println("The cost for your choice is Rs800 but after discount it is Rs"+disc);
                }
                else if(num==4)
                {
                    disc=1500-(0.20*1500);
                    name[z]="Sweater/Jackets";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost of your choice is Rs1500 but after discount it is Rs"+disc);
                    cost=cost+disc;
                }
                else if(num==5)
                {
                    disc=1250-(0.20*1250);
                    name[z]="Trousers/Shorts";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost of your choice is Rs1250 but after discount it is Rs"+disc);
                    cost=cost+disc;
                }
                else
                System.out.println("Please check your input");
                break;
                case 3:
                System.out.println("This is the Formal Wear");
                System.out.println("section and we are very glad to announce that we have recieved the latest designs!!!");
                System.out.println("The Formal Wear provides u with wide varieties.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l),Extra Large(xl).");
                System.out.println("Please enter the number according to ur choice");
                System.out.println("Enter 1.for Formal Pants");
                System.out.println("2.for Formal Shirts 3.for Suits 4.for Tuxedoes");
                System.out.println(" and 5.for Coats and Blazers");
                num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    disc=1999-(0.25*1999);
                    name[z]="Formal Pants";
                    price[z]=disc;
                    z++;
                    count=count+disc;
                    System.out.println("The cost for your choice is Rs.1999 but after discount it is Rs"+disc);
                }
                else if(num==2)
                {
                    disc=1000-(0.25*1000);
                    name[z]="Formal Shirts";
                    price[z]=disc;
                    z++;
                    cost=cost+disc;
                    System.out.println("The cost for your choice is Rs1000 but after discount it is Rs"+disc);
                }
                else if(num==3)
                {
                    disc=3999-(0.25*3999);
                    name[z]="Suits";
                    price[z]=disc;
                    z++;
                    cost=cost+disc;
                    System.out.println("The cost for your choice is Rs3999 but after discount it is Rs"+disc);
                }
                else if(num==4)
                {
                    disc=3999-(0.25*3999);
                    name[z]="Tuxedoes";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost of your choice is Rs3999 but after discount it is Rs"+disc);
                    cost=cost+disc;
                }
                else if(num==5)
                {
                    disc=2950-(0.25*2950);
                    name[z]="Coats and Blazers";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost of your choice is Rs2950 but after discount it is Rs"+disc);
                    cost=cost+disc;
                }
                else
                System.out.println("Please check your input");
                break;
                case 4:
                System.out.println("This is the Western Wear section and we are very glad to announce that we have recieved the latest designs.");
                System.out.println("The Western Wear section  provides you with wide varieties from the Western side itself.");
                System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l) and Extra Large(xl).");
                System.out.println("Please enter the numbers according to your choice:- ");
                System.out.println("Enter 1.for Jeans(Denim) 2.for Western Designed Tops.");
                num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    System.out.println("The cost for your choice is Rs 499");
                    cost=cost+499;
                    name[z]="Jeans(Denim)";
                    price[z]=499;
                    z++;
                }
                    else if(num==2)
                    {
                        System.out.println("The cost for your choice is Rs 299");
                        cost=cost+299;
                        name[z]="Western Designed Tops";
                        price[z]=299;
                        z++;
                    }
                    else
                    System.out.println("Please check your input");
                    break;
                    case 5:
                    System.out.println("This is the Party Wear section .");
                    System.out.println("The Party Wear section  provides you with amazing varieties of choices to choose from.");
                    System.out.println("We also provide sizes ranging from Small(s),Medium(m),Large(l) and Extra Large(xl).");
                    System.out.println("Please enter the numbers according to your choice:- ");
                    System.out.println("Enter 1.for Party Wear Suits 2.for Funky Party Wear Outfits.");
                    num=Integer.parseInt(std.readLine());
                    if(num==1)
                    {
                        System.out.println("The cost for your choice is Rs 2000");
                        cost=cost+2000;
                        name[z]="Party Wear Suit";
                        price[z]=2000;
                        z++;
                    }
                    else if(num==2)
                    {
                        System.out.println("The cost for your choice is Rs 2500");
                        cost=cost+2500;
                        name[z]="Funky Party Wear Outfits";
                        price[z]=2500;
                        z++;
                    }
                    else
                    System.out.println("Please check your input");
                    break;
                    default:
                    System.out.println("Please check your input");
                }
            }//end of function Men
                public void Surprise()throws IOException
        {
            BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to the Surprise clothing section !!!");
            System.out.println("This section is solely dedicated to all those young couples out there who have decided to tie the knot.");
            System.out.println("We try to make it special by providing a wide range of Bridal Wear for the Brides and Designer Wear for the Grooms to choose from. So please enter the number that you want!");
            System.out.println("All you need to do is look around and find the outfit of your size!");
            System.out.println("Enter 1.for Gowns 2.for Designer Sarees 3.for Designer Suits");
            System.out.println("4.for Designer Sherwanis.");
            int chwo=Integer.parseInt(std.readLine());
            switch(chwo)
            {
                case 1:
                {
                    System.out.println("The cost of your purchase is Rs5999");
                    cost=cost+5999;
                    name[z]="Gowns";
                    price[z]=5999;
                    z++;
                }
                break;
                case 2:
                {
                    System.out.println("The cost for your purchase is Rs.7999");
                    cost=cost+7999;
                    name[z]="Designer Sarees";
                    price[z]=7999;
                    z++;
                }
                break;
                case 3:
                {
                    System.out.println("The cost for your purchase is Rs 5999");
                    cost=cost+5999;
                    name[z]="Designer Suits";
                    price[z]=5999;
                    z++;
                }                 
                 break;
                 case 4:
                 {
                    System.out.println("The cost for your purchase is Rs 7999");
                    cost=cost+7999;
                    name[z]="Designer Sherwanis";
                    price[z]=7999;
                    z++;
                }
                  break;
                  default:
                  System.out.println("Please check your input");
                }
            }//end of function Surprise
             public void Kids()throws IOException
        {
            BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to the Kid's clothing section !!!");
            System.out.println("We provide a wide range of selections of clothes for your children to choose from.");
            System.out.println("We have provided certain categories for your kids!");
            System.out.println("The categories are for 1.0-12 months(Infants) 2.1-6 years 3.7-12 years 4.8-15 years.");
            System.out.println("Please enter the number of your choice.");
            int chwo=Integer.parseInt(std.readLine());
            switch(chwo)
            {
                case 1:
                System.out.println("Welcome to the Infants section and we are very glad to help you choose clothes for your tiny tots!");
                System.out.println("Please enter the gender of the baby.For example female or male");
                String sex=std.readLine();
                if(sex.equalsIgnoreCase("female"))
                {
                System.out.println("We are glad to announce all that is in store for your young baby girl.");
                System.out.println("Kindly look around and choose the correct size for your darling!!");
                System.out.println("Please enter 1.for Skirts/T-Shirts");
                System.out.println("2.for Plain Frocks 3.for Frilled Frocks!");
                int num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Skirts/T-Shirts";
                    price[z]=299;
                    z++;
                    System.out.println("The cost of your choice is Rs299");
                    cost=cost+299;
                }
                else if(num==2)
                {
                    name[z]="Plain Frocks";
                    price[z]=250;
                    z++;
                    System.out.println("The cost of your choice is Rs250");
                    cost=cost+250;
                }
                else if(num==3)
                {
                    name[z]="Frilled Frocks";
                    price[z]=325;
                    z++;
                    System.out.println("The cost of your choice is Rs325");
                    cost=cost+325;
                }
                else
                System.out.println("Please check your input");
            }
                else if(sex.equalsIgnoreCase("male"))
                {
                System.out.println("We are glad to announce all that is in store for your young baby boy.");
                System.out.println("Kindly look around and choose the correct size for your darling!!");
                System.out.println("Please enter 1.for Pants/T-Shirts");
                System.out.println("2.for Shorts/Tops!");
                int num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Pants/T-Shirts";
                    price[z]=199;
                    z++;
                    System.out.println("The cost of your choice is Rs199");
                    cost=cost+199;
                }
                else if(num==2)
                {
                    name[z]="Shorts/Tops";
                    price[z]=225;
                    z++;
                    System.out.println("The cost of your choice is Rs225");
                    cost=cost+225;
                }
                else
                System.out.println("Please check your input");
                }
                else
                System.out.println("Please check your input");
                break;
                case 2:
                System.out.println("Welcome to the 1-6 years category section");
                System.out.println("and we are very glad to help you choose clothes for your little angels!");
                System.out.println("Please enter the gender of the kid.For example female or male.");
                sex=std.readLine();
                if(sex.equalsIgnoreCase("female"))
                {
                System.out.println("We are glad to announce that is in store for your young baby girl.");
                System.out.println("Kindly look around and choose the correct size for your darling!!");
                System.out.println("Please enter 1.for Skirts/T-shirts/Shorts");
                System.out.println("2.for Plain Frocks 3.for Frilled Frocks 4.for Pretty Dresses");
                System.out.println(" and 5.for Dungrees and Pants/Jeans 6.for Ghagras!");
                int num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Skirts/T-Shirts/Shorts";
                    price[z]=299;
                    z++;
                    count=count+299;
                    System.out.println("The cost for your choice is Rs.299");
                }
                else if(num==2)
                {
                    name[z]="Plain Frocks";
                    price[z]=265;
                    z++;
                    cost=cost+265;
                    System.out.println("The cost for your choice is Rs265");
                }
                else if(num==3)
                {
                    name[z]="Frilled Frocks";
                    price[z]=325;
                    z++;
                    cost=cost+325;
                    System.out.println("The cost for your choice is Rs325");
                }
                else if(num==4)
                {
                    name[z]="Pretty Dresses";
                    price[z]=300;
                    z++;
                    System.out.println("The cost of your choice is Rs300");
                    cost=cost+300;
                }
                else if(num==5)
                {
                    name[z]="Dungrees and Pants/Jeans";
                    price[z]=299;
                    z++;
                    System.out.println("The cost of your choice is Rs299");
                    cost=cost+299;
                }
                else if(num==6)
                {
                    name[z]="Ghagras";
                    price[z]=399;
                    z++;
                    System.out.println("The cost of your choice is Rs399");
                    cost=cost+399;
                }
                else
                System.out.println("Please check your input");
                }
                else
                if(sex.equalsIgnoreCase("male"))
                {
                System.out.println("We are glad to announce that is in store for your young baby boy.");
                System.out.println("Kindly look around and choose the correct size for your darling!!");
                System.out.println("Please enter 1.for Pants/T-shirts");
                System.out.println("2.for Shorts/Tops 3.for Trousers 4.for Small Sherwanis!");
                int num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Pants/T-Shirts";
                    price[z]=299;
                    z++;
                    count=count+299;
                    System.out.println("The cost for your choice is Rs.299");
                }
                else if(num==2)
                {
                    name[z]="Shorts/Tops";
                    price[z]=225;
                    z++;
                    cost=cost+225;
                    System.out.println("The cost for your choice is Rs225");
                }
                else if(num==3)
                {
                    name[z]="Trousers";
                    price[z]=399;
                    z++;
                    cost=cost+399;
                    System.out.println("The cost for your choice is Rs399");
                }
                else if(num==4)
                {
                    name[z]="Small Sherwanis";
                    price[z]=399;
                    z++;
                    System.out.println("The cost of your choice is Rs399");
                    cost=cost+399;
                }
                else
                System.out.println("Please check your input");
                }
                else
                System.out.println("Please check your input");
                break;
                case 3:
                System.out.println("Welcome to the 7-12 years category section and we are glad to help you choose clothes for your little angles.");
                System.out.println("Please enter the gender of the kid.For example female or male.");
                sex=std.readLine();
                if(sex.equalsIgnoreCase("female"))
                {
                System.out.println("We are glad to announce all that is in store for your young baby girl.");
                System.out.println("Kindly look around and choose the correct size for your darling!! ");
                System.out.println("Please enter 1.for Skirts/T-Shirts/Shorts 2.for Pretty Dresses.");
                System.out.println("3.for Dungrees and Pants/Jeans 4.for Ghagras.");
                int num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    System.out.println("The cost for your choice is Rs 399");
                    cost=cost+399;
                    name[z]="Skirts/T-Shirts/Shorts";
                    price[z]=399;
                    z++;
                }
                    else
                    if(num==2)
                    {
                        System.out.println("The cost for your choice is Rs 295");
                        cost=cost+295;
                        name[z]="Pretty Dresses";
                        price[z]=295;
                        z++;
                    }
                    else
                    if(num==3)
                    {
                        System.out.println("The cost for your choice is Rs 325");
                        cost=cost+325;
                        name[z]="Dungrees and Pants/Jeans";
                        price[z]=325;
                        z++;
                    }
                    else
                    if(num==4)
                    {
                        System.out.println("The cost for your choice is Rs 300");
                        cost=cost+300;
                        name[z]="Ghagras";
                        price[z]=300;
                        z++;
                    }
                    else
                    System.out.println("Please check your input");
                    }
                    if(sex.equalsIgnoreCase("male"))
                 {
                 System.out.println("We are glad to announce that is in store for your young baby boy.");
                 System.out.println("Kindly look around and choose the correct size for your darling!!");
                 System.out.println("Please enter 1.for Pants/T-shirts");
                 System.out.println("2.for Shorts/Tops 3.for Trousers 4.for Small Sherwanis!");
                 int num=Integer.parseInt(std.readLine());
                 if(num==1)
                 {
                     name[z]="Pants/T-Shirts";
                     price[z]=299;
                     z++;
                     count=count+299;
                     System.out.println("The cost for your choice is Rs.299");
                 }
                 else if(num==2)
                 {
                     name[z]="Shorts/Tops";
                     price[z]=225;
                     z++;
                     cost=cost+225;
                     System.out.println("The cost for your choice is Rs225");
                 }
                 else if(num==3)
                 {
                     name[z]="Trousers";
                     price[z]=399;
                     z++;
                     cost=cost+399;
                     System.out.println("The cost for your choice is Rs399");
                 }
                 else if(num==4)
                 {
                     name[z]="Small Sherwanis";
                     price[z]=399;
                     z++;
                     System.out.println("The cost of your choice is Rs399");
                     cost=cost+399;
                 }
                 else
                 System.out.println("Please check your input");
                 }
                 else
                 System.out.println("Please check your input");
                 break;
                 case 4:
                 System.out.println("Welcome to the 8-15 years category section and");
                 System.out.println("we are glad to help you choose clothes for your little angles.");
                 System.out.println("Please enter the gender of the kid.For example female or male.");
                 sex=std.readLine();
                 if(sex.equalsIgnoreCase("female"))
                 {
                 System.out.println("We are glad to announce all that is in store for your young baby girl.");
                 System.out.println("Kindly look around and choose the correct size for your darling!! ");
                 System.out.println("Please enter 1.for Skirts/T-Shirts/Shorts 2.for Pretty Dresses.");
                 System.out.println("3.for Dungrees and Pants/Jeans 4.for Ghagras.");
                 int num=Integer.parseInt(std.readLine());
                 if(num==1)
                 {
                     System.out.println("The cost for your choice is Rs 399");
                    cost=cost+399;
                     name[z]="Skirts/T-Shirts/Shorts";
                     price[z]=399;
                     z++;
                 }
                     else
                     if(num==2)
                     {
                         System.out.println("The cost for your choice is Rs 295");
                         cost=cost+295;
                         name[z]="Pretty Dresses";
                         price[z]=295;
                         z++;
                     }
                     else
                     if(num==3)
                     {
                         System.out.println("The cost for your choice is Rs 325");
                         cost=cost+325;
                         name[z]="Dungrees and Pants/Jeans";
                         price[z]=325;
                         z++;
                     }
                     else
                     if(num==4)
                     {
                         System.out.println("The cost for your choice is Rs 300");
                         cost=cost+300;
                         name[z]="Ghagras";
                         price[z]=300;
                         z++;
                     }
                     else
                     System.out.println("Please check your input");
                     }
                     if(sex.equalsIgnoreCase("male"))
                  {
                  System.out.println("We are glad to announce that is in store for your young baby boy.");
                  System.out.println("Kindly look around and choose the correct size for your darling!!");
                  System.out.println("Please enter 1.for Pants/T-shirts");
                  System.out.println("2.for Shorts/Tops 3.for Trousers 4.for Small Sherwanis!");
                  int num=Integer.parseInt(std.readLine());
                  if(num==1)
                  {
                      name[z]="Pants/T-Shirts";
                      price[z]=399;
                      z++;
                      count=count+399;
                      System.out.println("The cost for your choice is Rs.399");
                  }
                  else if(num==2)
                  {
                      name[z]="Shorts/Tops";
                      price[z]=325;
                      z++;
                      cost=cost+325;
                      System.out.println("The cost for your choice is Rs325");
                  }
                  else if(num==3)
                  {
                      name[z]="Trousers";
                      price[z]=299;
                      z++;
                      cost=cost+299;
                      System.out.println("The cost for your choice is Rs299");
                  }
                  else if(num==4)
                  {
                      name[z]="Small Sherwanis";
                      price[z]=399;
                      z++;
                      System.out.println("The cost of your choice is Rs399");
                      cost=cost+399;
                  }
                  else
                  System.out.println("Please check your input");
                  }
                  else
                  System.out.println("Please check your input");
                  break;
                  default:
                  System.out.println("Please check your input");
                 }
             }//end of function Kids
              public void Accessories()throws IOException
        {
            BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to the Accessories section !!!");
            System.out.println("We provide a wide range of selections of Accessories to choose from.");
            System.out.println("If you are looking for the basic necessities then you are in the right place!");
            System.out.println("The Accessories available are given below so please enter the number of your choice.");
            System.out.println("Enter 1.for Cosmetics 2.for Belts 3.for Bangles/Bracelets 4.for Chains with beautiful Pendants.");
            System.out.println("5.for Hairbands/Clips etc.. 6.for Ties");
            int chwo=Integer.parseInt(std.readLine());
            switch(chwo)
            {
                case 1:
                System.out.println("We are glad to announce all that there is 15% discount on your purchase of Rs2000");
                    disc=2000-(0.15*2000);
                    name[z]="Cosmetics";
                    price[z]=disc;
                    z++;
                    System.out.println("The cost of your purchase after calculating discount is Rs"+disc);
                    cost=cost+disc;
                 break;
                 case 2:
                 System.out.println("We are glad to announce that ther is 5% discount on your purchase of Rs500");
                    disc=500-(0.05*500);
                    name[z]="Belts";
                    price[z]=disc;
                    z++;
                    count=count+disc;
                    System.out.println("The cost for your purchase after calculating discount is Rs"+disc);
                
                break;
                case 3:
                System.out.println("We are glad to announce that there is 5% discount on your purchase of Rs299");
                    disc=299-(0.05*299);
                    name[z]="Bangles/Bracelets";
                    price[z]=disc;
                    z++;
                    count=count+disc;
                    System.out.println("The cost for your purchase after calculating discount is Rs"+disc);
                break;
                case 4:
                System.out.println("We are glad to announce all that there is 2% discount on your purchase of Rs250");
                    disc=250-(0.02*250);
                    name[z]="Chains";
                    price[z]=disc;
                    z++;
                    cost=cost+disc;
                    System.out.println("The cost for your purchase after calculating discount is Rs"+disc);
                 break;
                 case 5:
                 System.out.println("We are glad to announce all that there is 2% discount on your purchase of Rs150");
                     disc=150-(0.02*150);                        
                     name[z]="Hairbands/Clips";
                     price[z]=disc;
                     z++;
                     cost=cost+disc;
                     System.out.println("The cost for your purchase after calculating discount is Rs"+disc);
                  break;
                  case 6:
                  System.out.println("We are glad to announce that there is 2% discount on your purchase of Rs175");
                     disc=175-(0.02*175);
                     name[z]="Ties";
                     price[z]=disc;
                     z++;
                     count=count+disc;
                     System.out.println("The cost for your purchase after calculating is Rs"+disc);
                  break;
                  default:
                  System.out.println("Please check your input");
                 }
             }//end of function Accessories
              public void Shoes()throws IOException
        {
            BufferedReader std=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to the Shoes section !!!");
            System.out.println("We provide a wide range of Shoes far all those shoe lovers out there.");
            System.out.println("All you need to do is look around find what you like in your size!");
            System.out.println("For more convenience we have grouped Mens Footwear and Womens Footwear!");
            System.out.println("Enter 1.for Mens Footwear 2.for Womens Footwear");
            int chwo=Integer.parseInt(std.readLine());
            switch(chwo)
            {
                case 1:
                System.out.println("Welcome to Mens Footwear Section!!");
                System.out.println("We hope to fulfill your need and thus provide you with a rangeof choices to choose from!");
                System.out.println("Enter 1.for Normal/Running Shoes/Converse 2.for Boots 3.for Sandals 4.for Leather Shoes");
                int num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Normal/Running Shoes/Converse";
                    price[z]=3000;
                    z++;
                    System.out.println("The cost of your choice is Rs3000");
                    cost=cost+3000;
                }
                else if(num==2)
                {
                    name[z]="Boots";
                    price[z]=6500;
                    z++;
                    System.out.println("The cost of your choice is Rs6500");
                    cost=cost+6500;
                }
                else if(num==3)
                {
                    name[z]="Sandals";
                    price[z]=2000;
                    z++;
                    System.out.println("The cost of your choice is Rs2000");
                    cost=cost+2000;
                }
                else if(num==4)
                {
                    name[z]="Leather Shoes";
                    price[z]=4000;
                    z++;
                    System.out.println("The cost of your choice is Rs4000");
                    cost=cost+4000;
                }
                else
                System.out.println("Please check your input");
                break;
                case 2:
                System.out.println("Welcome to the Womens Footwear Section!!");
                System.out.println("We hope to fulfill your need and thus provide you with a rangeof choices to choose from!");
                System.out.println("Enter 1.for Normal/Running Shoes 2.for Boots 3.for Sandals/Flats 4.for Stilletos 5.for Mid Heels and 6.for High Heels");
                num=Integer.parseInt(std.readLine());
                if(num==1)
                {
                    name[z]="Normal/Running Shoes";
                    price[z]=3000;
                    z++;
                    System.out.println("The cost of your choice is Rs3000");
                    cost=cost+3000;
                }
                else if(num==2)
                {
                    name[z]="Boots";
                    price[z]=6500;
                    z++;
                    System.out.println("The cost of your choice is Rs6500");
                    cost=cost+6500;
                }
                else if(num==3)
                {
                    name[z]="Sandals/Flats";
                    price[z]=2000;
                    z++;
                    System.out.println("The cost of your choice is Rs2000");
                    cost=cost+2000;
                }
                else if(num==4)
                {
                    name[z]="Stilletos";
                    price[z]=5400;
                    z++;
                    System.out.println("The cost of your choice is Rs5400");
                    cost=cost+5400;
                }
                else if(num==5)
                {
                    name[z]="Mid Heels";
                    price[z]=4000;
                    z++;
                    System.out.println("The cost of your choice is Rs4000");
                    cost=cost+4000;
                }
                else if(num==6)
                {
                    name[z]="High Heels";
                    price[z]=4500;
                    z++;
                    System.out.println("The cost of your choice is Rs4500");
                    cost=cost+4500;
                }
                else
                System.out.println("Please check your input");
                break;
                default:
                System.out.println("Please check your input");
            }
        }//end of function Shoes
    }