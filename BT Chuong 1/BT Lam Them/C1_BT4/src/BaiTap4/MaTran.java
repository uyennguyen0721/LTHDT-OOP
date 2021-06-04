package BaiTap4;


public class MaTran {
	public static Integer[][] NhapMaTran(int n, int m) {
		Integer[][] a = new Integer[n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++) {
				a[i][j] = (int)(Math.random()*10 - 5);
			}
		return a;
	}
	public static void XuatMaTran(Integer[][] a, int n, int m) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
	} 
	//Xay dung ma tran b co kich thuoc tu n x m tu ma tran A, moi phan tu b[i][j] cua ma tran b la so luong cac phan tu duong xung quanh a[i][j] trong ma tran a 
	public static Integer[][] XDMaTran(Integer[][] a, int n, int m) {
		Integer[][] b = new Integer[n][m];
		for(int i = 0; i < n; i++) {
			if(i == 0)
				for(int j = 0; j < m; j++) {
					int dem = 0;
					if(j == 0) {
						for(int k = i; k <= i + 1; k++)
							for(int h = j; h <= j + 1; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
					}
					if(j == m - 1) {
						for(int k = i ; k <= i + 1; k++)
							for(int h = j - 1; h <= j; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
					}
					if(j != 0 && j != m - 1)
						for(int k = i; k <= i + 1; k++)
							for(int h = j - 1; h <= j + 1; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
						
				}
			if(i == n - 1)
				for(int j = 0; j < m; j++) {
					int dem = 0;
					if(j == 0) {
						for(int k = i - 1; k <= i; k++)
							for(int h = j; h <= j + 1; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
					}
					if(j == m - 1) {
						for(int k = i - 1 ; k <= i; k++)
							for(int h = j - 1; h <= j; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
					}
					if(j != 0 && j != m - 1)
						for(int k = i - 1; k <= i; k++)
							for(int h = j - 1; h <= j + 1; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
						
				}
			if(i != 0 && i!= n - 1)
				for(int j = 0; j < m; j++) {
					int dem = 0;
					if(j == 0) {
						for(int k = i - 1; k <= i + 1; k++)
							for(int h = j; h <= j + 1; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
					}
					if(j == m - 1) {
						for(int k = i - 1 ; k <= i + 1; k++)
							for(int h = j - 1; h <= j; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
					}
					if(j != 0 && j != m - 1)
						for(int k = i - 1; k <= i + 1; k++)
							for(int h = j - 1; h <= j + 1; h++)
								if(a[k][h] != a[i][j] && a[k][h] > 0)
									dem++;
						b[i][j] = dem;
						
				}
				
			
		}
		return b;
	}

}
