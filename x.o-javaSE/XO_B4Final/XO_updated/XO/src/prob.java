/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author hager hussien
 */
public class prob {
    
    public void xwin(int arr[])
    {
    if (arr[0]==0&&arr[1]==0&&arr[2]==0)
    {JOptionPane.showMessageDialog(null, "X WINS!");}
    if (arr[3]==0&&arr[4]==0&&arr[5]==0)
    {}
    if (arr[6]==0&&arr[7]==0&&arr[8]==0)
    {}
    if (arr[0]==0&&arr[3]==0&&arr[6]==0)
    {}
    if (arr[1]==0&&arr[4]==0&&arr[7]==0)
    {}
    if (arr[2]==0&&arr[5]==0&&arr[8]==0)
    {}
    if (arr[0]==0&&arr[4]==0&&arr[8]==0)
    {}
    if (arr[2]==0&&arr[4]==0&&arr[6]==0)
    {}
    
    }
    
    
    
    
    public void owin(int a[])
    {
    if (a[0]==1&&a[1]==1&&a[2]==1)
    {}
    if (a[3]==1&&a[4]==1&&a[5]==1)
    {}
    if (a[6]==1&&a[7]==1&&a[8]==1)
    {}
    if (a[0]==1&&a[3]==1&&a[6]==1)
    {}
    if (a[1]==1&&a[4]==1&&a[7]==1)
    {}
    if (a[2]==1&&a[5]==1&&a[8]==1)
    {}
    if (a[0]==1&&a[4]==1&&a[8]==1)
    {}
    if (a[2]==1&&a[4]==1&&a[6]==1)
    {}
    
    }
    
    
    
}
