import java.io.*;
import java.util.*;

public class Problem2533 {

	static ArrayList<LinkedList<Integer>> edges;
	static int[][] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n, i, u, v;
		n = Integer.parseInt(bw.readLine());
		edges = new ArrayList<LinkedList<Integer>>();

		for (i = 0; i < n; i++)
			edges.add(new LinkedList<Integer>());

		for (i = 0; i < n - 1; i++) {
			st = new StringTokenizer(bw.readLine());
			u = Integer.parseInt(st.nextToken()) - 1;
			v = Integer.parseInt(st.nextToken()) - 1;
			edges.get(u).add(v);
			edges.get(v).add(u);
		}

		dp = new int[n][2];
		find(0, 0);

		System.out.print(Math.min(dp[0][0], dp[0][1]));

		bw.close();
	}

	static void find(int cnt, int parent) {
		dp[cnt][1] = 1;
		for (int v : edges.get(cnt)) {
			if (v == parent)
				continue;
			find(v, cnt);
			dp[cnt][0] += dp[v][1];
			dp[cnt][1] += Math.min(dp[v][0], dp[v][1]);
		}

	}

}
