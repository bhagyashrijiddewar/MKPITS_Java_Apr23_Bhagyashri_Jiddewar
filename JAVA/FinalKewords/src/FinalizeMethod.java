public class FinalizeMethod {
        public static void main(String[] args)
        {
            FinalizeMethod finalKeyword = new FinalizeMethod();
            // printing the hashcode
            System.out.println("Hashcode is: " + finalKeyword.hashCode());
            finalKeyword = null;
            // calling the garbage collector using gc()
            System.gc();
            System.out.println("End of the garbage collection");
        }
        // defining the finalize method
        protected void finalize()
        {
            System.out.println("Called the finalize() method");
        }
    }


