package cosasruben;


public class burburja {
        
        public static void main(String arg[]){  
                int vec[]={6,8,3,5,4,9,0,2,1,7};
            System.out.print("Vector sin ordenar: ");
            for(int i=0;i<vec.length;i++){
                System.out.print(vec[i]+" ");
            }
            //Ordenamiento
            for(int i=0; i < vec.length-1; i++){
                   for(int j=0; j < (vec.length-i)-1; j++){  
                        if(vec[j] > vec[j+1]){  
                                int aux=vec[j];                 
                                vec[j]=vec[j+1];           
                                vec[j+1]=aux;
                         }    
                   }
              }
            System.out.print("\nVector ordenado: ");
            for(int i=0;i<vec.length;i++){
                System.out.print(vec[i]+" ");
            }
        }
}
