int first_occ(int arr[], int n, int k)
{
    int s = 0, e = n - 1;
    int m = s + (e - s) / 2;
    int ans = -1;
    while (s <= e)
    {
        if (arr[m] == k)
        {
            ans = m;
            e = m - 1;
        }
        else if (k > arr[m])
        {
            s = m + 1;
        }
        else
        {
            e = m - 1;
        }
        m = s + (e - s) / 2;
    }
    return ans;
}
int last_occ(int arr[], int n, int k)
{
    int s = 0, e = n - 1;
    int m = s + (e - s) / 2;
    int ans = -1;
    while (s <= e)
    {
        if (arr[m] == k)
        {
            ans = m;
            s = m + 1;
        }
        else if (k > arr[m])
        {
            s = m + 1;
        }
        else
        {
            e = m - 1;
        }
        m = s + (e - s) / 2;
    }
    return ans;
}
int countOccurences(int arr[], int n, int X)
{
int first=first_occ(arr,n,X);
int second=last_occ(arr,n,X);
   if(first==-1&&second==-1)
       return 0;
    else
        return (second)-(first)+1;
}