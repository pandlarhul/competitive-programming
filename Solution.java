class Solution {
	public static void main(String args[]){

//		Scanner scn = new Scanner(System.in);
		int times[][] = {{1,2,5},{1,3,2},{1,5,0},{1,8,7},{3,7,3},{3,4,4},{3,6,6},{4,9,1},{9,10,2},{5,11,5}};
		int n =11;
		int k = 1;
		int time = networkDelayTime(times,n,k);
		System.out.println(time);
	}

    public static int networkDelayTime(int [][] times, int N, int K) {
        int graph[][] = new int[N][N];
        for(int i = 0 ; i < times.length ; i ++){
                graph[times[i][0] - 1][times[i][1] - 1] = times[i][2];
        }
        
        int start = K - 1;
        int time[] = new int[N];
        for(int i = 0; i < 1 ; i ++){
            time[i] = travelTime(graph, start);
		//System.out.println("time[i]="+time[i]);
        }
        
	

        int max = -99999;
        for(int i = 0; i < graph[0].length ; i ++){
            if(time[i] > max){
                max = time[i];
            }
        }
        return max;
        
    }
    
    public static int travelTime(int graph[][], int start){
        int total = 0 ;
        for(int i = 0; i < graph[0].length ; i++){
            if(graph[start][i] != 0){
		System.out.println("i , j ="+start + " "+i);
                	total = Math.max(total,graph[start][i]+travelTime(graph,i));
            }
        } 
/*	int j=0;
	while(j<graph[0].length) {
		if(graph[start][j]!=0) {
			System.out.println("i , j ="+start + " "+j);
			total = Math.max(total,graph[start][j]+travelTime(graph,j));
			System.out.println("total : "+total);
		}
		++j;
	}
*/
	return total;
    }
}


