package Practice;
class myarr {
    public static void main(String[] args) {
    int[] myarr = new int[5];
    myarr[0] = 9;
    myarr[1] = 5;
    myarr[2] = 6;
    myarr[3] = 445;
    myarr[4] = 557;
        

   /*  System.out.println(myarr[0]);
    System.out.println(myarr[1]);
    System.out.println(myarr[2]);
    System.out.println(myarr[3]);
    System.out.println(myarr[4]);*/
    

    //array traversal
int i = 0;
while(i < myarr.length){     //you can also put array size ie 5 . we have used '.length' fn.
    System.out.println(myarr[i]);
    i++;
}

        
    }
    
}
