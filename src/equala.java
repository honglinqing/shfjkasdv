public class equala {
    public  boolean compare(int a[],int b[]){
        if(a==null||b==null){
            return false;
        }
        if(a.length!=b.length){
            return false;
        }
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=b[i]){
                return false;
            }


        }
        return true;
    }
}
