	//recursive merge sort method
	public int[] mergeSort(int [] x)
	{
		if(x.length > 1)
		{
			int arr1 = x.length / 2;
			int arr2 = x.length - arr1;
			
			int[] a1 = new int[arr1];
			int[] a2 = new int[arr2];
			
			//copy elements into first array
			for(int i = 0; i < arr1; i++)
			{
				a1[i] = x[i];
			}
			
			//copy elements into second array
			for(int j = arr1; j < x.length; j++)
			{
				a2[j - arr1] = x[j];
			}

			a1 = mergeSort(a1);
			a2 = mergeSort(a2);
			
		
			x = merge(a1, a2);
			
		}
		
		return x;
	}
	
	//method helper for merge sort
	public int[] merge(int [] a1, int [] a2)
	{
		int [] x = new int[a1.length + a2.length];
		int i = 0, j = 0, k = 0;
		
		while(a1.length != j && a2.length !=k)
		{
			if(a1[j] < a2[k])
			{
				x[i] = a1[j];
				i++;
				j++;
			}
			else
			{
				x[i] = a2[k];
				i++;
				k++;
			}
		}
		
		//copy any remaining elements into the array
		while(a1.length != j)
		{
			x[i] = a1[j];
			i++;
			j++;
		}
		while(a2.length != k)
		{
			x[i] = a2[k];
			i++;
			k++;
		}
		
		
		return x;
	}
