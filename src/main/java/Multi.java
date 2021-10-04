public class Multi {
    int [][] matrix = new int[3][3];
    void calc() {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j <matrix[i]; j++)

                matrix[i][j] = i * matrix.length * i;

//            iterator<Person> it = matrix.iterator();
//            while(it.hasNext()){
//                Person here = it.next();
//                System.out.println(here.getName());

            }

    }

}
