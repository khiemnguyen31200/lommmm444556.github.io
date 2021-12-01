using System;
using System.Drawing;
using System.Windows.Forms;
using System.Collections;
using System.Text.RegularExpressions;

namespace fullyClone
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        ArrayList arrthu = new ArrayList();
        ArrayList arrchi = new ArrayList();

        private void txtinput_TextChanged(object sender, EventArgs e)
        {
            if (txtinput.Text == "")
            {
                labstatus.Text = "Vui lòng nhập số !";
                labstatus.ForeColor = Color.Black;
                btnadd.Enabled = false;
                btnclear.Enabled = false;
            }
            else if (txtinput.Text != "")
            {
                if (Regex.IsMatch(txtinput.Text, @"^(-?[1-9]+\d*([.]\d+)?)$|^(-?0[.]\d*[1-9]+)$|^0$|^0.0$"))
                //REGEX số dương và số âm số nguyên @"^-?[0-9]\d*\.?[0]*$" // chỉ cho số dương nguyên @"^[0-9]\d*\.?[0]*$"
                //REGEX số âm và dương có sử dụng thập phân @"^(-?[1-9]+\d*([.]\d+)?)$|^(-?0[.]\d*[1-9]+)$|^0$|^0.0$"

                {
                    labstatus.Text = "Được chấp nhận !";
                    labstatus.ForeColor = Color.Green;
                    btnadd.Enabled = true;
                    btnclear.Enabled = true;
                }
                else
                {
                    labstatus.ForeColor = Color.Red;
                    labstatus.Text = "Vui lòng chỉ nhập số hợp lệ !";
                    btnadd.Enabled = false;
                    btnclear.Enabled = true;
                }

            }
        }

        private void btnadd_Click(object sender, EventArgs e)
        {
            if (rdbchi.Checked)
            {
                lstchi.Items.Add(txtinput.Text);
                arrchi.Add(Convert.ToDouble(txtinput.Text));
            }
            else if (rdbthu.Checked)
            {
                lstthu.Items.Add(txtinput.Text);
                arrthu.Add(Convert.ToDouble(txtinput.Text));
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            int i;
            labstatus.Text = "Vui lòng nhập số";
            txtresult.ReadOnly = true;
            btncal.Enabled = false;            
            lstchi.Enabled = false;
            txtinput.Text = "200000";
            for (i=0;i<lstthu.Items.Count;i++)
            {
                arrthu.Add(Convert.ToDouble(lstthu.Items[i]));
            }
            for (i = 0; i < lstchi.Items.Count; i++)
            {
                arrchi.Add(Convert.ToDouble(lstchi.Items[i]));
            }
        }

        private void rdbthu_CheckedChanged(object sender, EventArgs e)
        {
            if (rdbthu.Checked)
            {
                lstthu.Enabled = true;
            } 
            else
            {
                lstthu.Enabled = false;
            }
        }

        private void rdbchi_CheckedChanged(object sender, EventArgs e)
        {
            if (rdbchi.Checked)
            {
                lstchi.Enabled = true;
               
            }
            else
            {
                lstchi.Enabled = false;
            }
        }

        private void btndelete_Click(object sender, EventArgs e)
        {
            if (rdbthu.Checked)
            {
                
                try
                {
                    arrthu.RemoveAt(lstthu.SelectedIndex);
                    lstthu.Items.RemoveAt(lstthu.SelectedIndex);
                }
                catch 
                {
                    MessageBox.Show("Vui lòng chọn dòng cần xóa !","Cảnh báo");
                }


            }
            else if (rdbchi.Checked)
            {
                try
                {
                    arrchi.RemoveAt(lstchi.SelectedIndex);
                    lstchi.Items.RemoveAt(lstchi.SelectedIndex);
                }
                catch
                {
                    MessageBox.Show("Vui lòng chọn dòng cần xóa !", "Cảnh báo");
                }
            }
        }

        private void chkThu_CheckedChanged(object sender, EventArgs e)
        {
            if (chkThu.Checked)
            {
                btncal.Enabled = true;
            }
            else if (!chkThu.Checked && !chkChi.Checked)
            {
                btncal.Enabled = false;
            }

            if (chkThu.Checked && chkChi.Checked)
            {
                txtresult.Text = "Tổng thu chi";

            }
            else if (chkThu.Checked)
            {
                txtresult.Text = "Tổng thu";
            }
            else if (chkChi.Checked)
            {
                txtresult.Text = "Tổng chi";
            }

            else if (!chkThu.Checked && !chkChi.Checked)
            {
                txtresult.Text = "";

            }
        }

        private void chkChi_CheckedChanged(object sender, EventArgs e)
        {
            if (chkChi.Checked)
            {
                btncal.Enabled = true;
            }
            else if (!chkChi.Checked && !chkThu.Checked)
            {
                btncal.Enabled = false;
            }

            if (chkThu.Checked && chkChi.Checked)
            {
                txtresult.Text = "Tổng thu chi";

            }
            else if (chkThu.Checked)
            {
                txtresult.Text = "Tổng thu";
            }
            else if (chkChi.Checked)
            {
                txtresult.Text = "Tổng chi";
            }
            else if (!chkThu.Checked && !chkChi.Checked)
            {
                txtresult.Text = "";

            }
        }

        private void btncal_Click(object sender, EventArgs e)
        {
            double sum = 0;
            //int i;
            if (chkChi.Checked && chkThu.Checked)
            {
                //for (i = 0; i < lstchi.Items.Count; i++)
                //{
                //    sum -= Convert.ToDouble(lstchi.Items[i]);
                //}
                //for(i=0; i < lstthu.Items.Count; i++)
                //{
                //    sum += Convert.ToDouble(lstthu.Items[i]);
                //}
                foreach(double elementThu in arrthu)
                {
                    sum += elementThu;
                }
                foreach(double elementChi  in arrchi)
                {
                    sum -=  elementChi;
                }
                txtresult.Text = Convert.ToString(sum);

            }
            else if (chkThu.Checked)
            {

                //for (i = 0; i < lstthu.Items.Count; i++)
                //{
                //    sum += Convert.ToDouble(lstthu.Items[i]);
                //}
                foreach (double elementThu in arrthu)
                {
                    sum = sum + elementThu;
                }
                txtresult.Text = Convert.ToString(sum);
            }
            else if (chkChi.Checked)
            {
                //for (i = 0; i < lstchi.Items.Count; i++)
                //{
                //    sum += Convert.ToDouble(lstchi.Items[i]);
                //}
                foreach (double elementChi in arrchi)
                {
                    sum = sum + elementChi;
                }
                txtresult.Text = Convert.ToString(sum);
            }
        }

        private void btnclear_Click(object sender, EventArgs e)
        {
            txtinput.Text = "";
            labstatus.ForeColor = Color.Black;
        }

        private void btnClearList_Click(object sender, EventArgs e)
        {
            if (rdbthu.Checked)
            {
                lstthu.Items.Clear();
                arrthu.Clear();
                
            }else if (rdbchi.Checked)
            {
                lstchi.Items.Clear();
                arrchi.Clear();
            }
        }

        
    }
}
