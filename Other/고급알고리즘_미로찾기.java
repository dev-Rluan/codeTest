//class 고급알고리즘_미로찾기{
//    int dx = {-1, 0, 1, 0};
//    int dy = {0, 1, 0, -1};
//    int n, m;
//
//    int[][] miro;
//
//
//    public static int maze(int x, int y){
//        int count = 1;
//        miro[x][y]=0;
//        Queue<Integer> queue = new Linkdlist<>();
//
//        queue.add(x);
//        queue.add(y);
//
//        while(!queue.isEmputy()){
//            x = queue.poll();
//            y = queue.poll();
//
//            for(int i=0; i < 4; i++){
//                int nx = x +dx[i];
//                int ny = y + dy[i];
//
//                if(nx < 0 || ny < 0 || nx > n || ny || m){
//                    contiue;
//                }
//
//                if(miro[nx][ny] == 0 && nx > x && ny > y){
//                    count++;
//
//
//                }
//            }
//        }
//
//
//
//    }
//
//    public static void main(String[] args){
//        BufferedReader br = new BufferedReader(new InputStreamReader(Sysyem.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//
//        miro = new [n][m];
//        for(int i=0; i < n; i++){
//            String[] strs = br.readLine().split("");
//            for(int j=0; j < m; j++){
//                int[i][j] = Integer.parseInt(strs[j]);
//            }
//        }
//
//
//
//
//    }
//}
//
