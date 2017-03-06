	//quick sort implementation
	public int[] quickSort(int a[], int l, int r)
	{ 
		if(l < r)
		{
			int i = partition(a, l, r);
			quickSort(a, l, i - 1);
			quickSort(a, i + 1, r);
		}
		
		return a;
	}
	
	//partition for quicksort
	public int partition(int[] a, int l, int r)
	{
		int x = a[r];
		int temp;
		
		int i = l - 1;
		
		for(int j = l; j < r; j++)
		{
			if(a[j] <= x)
			{
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		temp = a[i+1];
		a[i+1] = a[r];
		a[r] = temp;
		
		return (i+1);
	}
