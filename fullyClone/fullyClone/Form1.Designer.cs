
namespace fullyClone
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.grbtodo = new System.Windows.Forms.GroupBox();
            this.btncal = new System.Windows.Forms.Button();
            this.grbresult = new System.Windows.Forms.GroupBox();
            this.txtresult = new System.Windows.Forms.TextBox();
            this.grbseltodo = new System.Windows.Forms.GroupBox();
            this.chkChi = new System.Windows.Forms.CheckBox();
            this.chkThu = new System.Windows.Forms.CheckBox();
            this.grbinput = new System.Windows.Forms.GroupBox();
            this.btnClearList = new System.Windows.Forms.Button();
            this.btnclear = new System.Windows.Forms.Button();
            this.labstatus = new System.Windows.Forms.Label();
            this.lstchi = new System.Windows.Forms.ListBox();
            this.lstthu = new System.Windows.Forms.ListBox();
            this.rdbchi = new System.Windows.Forms.RadioButton();
            this.rdbthu = new System.Windows.Forms.RadioButton();
            this.btndelete = new System.Windows.Forms.Button();
            this.btnadd = new System.Windows.Forms.Button();
            this.txtinput = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.grbtodo.SuspendLayout();
            this.grbresult.SuspendLayout();
            this.grbseltodo.SuspendLayout();
            this.grbinput.SuspendLayout();
            this.SuspendLayout();
            // 
            // grbtodo
            // 
            this.grbtodo.Controls.Add(this.btncal);
            this.grbtodo.Controls.Add(this.grbresult);
            this.grbtodo.Controls.Add(this.grbseltodo);
            this.grbtodo.Location = new System.Drawing.Point(511, 102);
            this.grbtodo.Name = "grbtodo";
            this.grbtodo.Size = new System.Drawing.Size(251, 306);
            this.grbtodo.TabIndex = 5;
            this.grbtodo.TabStop = false;
            this.grbtodo.Text = "Yêu cầu";
            // 
            // btncal
            // 
            this.btncal.Location = new System.Drawing.Point(88, 227);
            this.btncal.Name = "btncal";
            this.btncal.Size = new System.Drawing.Size(75, 23);
            this.btncal.TabIndex = 2;
            this.btncal.Text = "Tính toán";
            this.btncal.UseVisualStyleBackColor = true;
            this.btncal.Click += new System.EventHandler(this.btncal_Click);
            // 
            // grbresult
            // 
            this.grbresult.Controls.Add(this.txtresult);
            this.grbresult.Location = new System.Drawing.Point(19, 155);
            this.grbresult.Name = "grbresult";
            this.grbresult.Size = new System.Drawing.Size(218, 63);
            this.grbresult.TabIndex = 1;
            this.grbresult.TabStop = false;
            this.grbresult.Text = "Kết quả";
            // 
            // txtresult
            // 
            this.txtresult.Location = new System.Drawing.Point(16, 22);
            this.txtresult.Name = "txtresult";
            this.txtresult.Size = new System.Drawing.Size(185, 23);
            this.txtresult.TabIndex = 0;
            // 
            // grbseltodo
            // 
            this.grbseltodo.Controls.Add(this.chkChi);
            this.grbseltodo.Controls.Add(this.chkThu);
            this.grbseltodo.Location = new System.Drawing.Point(19, 40);
            this.grbseltodo.Name = "grbseltodo";
            this.grbseltodo.Size = new System.Drawing.Size(218, 100);
            this.grbseltodo.TabIndex = 0;
            this.grbseltodo.TabStop = false;
            this.grbseltodo.Text = "Tính toán";
            // 
            // chkChi
            // 
            this.chkChi.AutoSize = true;
            this.chkChi.Location = new System.Drawing.Point(129, 40);
            this.chkChi.Name = "chkChi";
            this.chkChi.Size = new System.Drawing.Size(72, 19);
            this.chkChi.TabIndex = 1;
            this.chkChi.Text = "Tổng chi";
            this.chkChi.UseVisualStyleBackColor = true;
            this.chkChi.CheckedChanged += new System.EventHandler(this.chkChi_CheckedChanged);
            // 
            // chkThu
            // 
            this.chkThu.AutoSize = true;
            this.chkThu.Location = new System.Drawing.Point(16, 40);
            this.chkThu.Name = "chkThu";
            this.chkThu.Size = new System.Drawing.Size(74, 19);
            this.chkThu.TabIndex = 0;
            this.chkThu.Text = "Tổng thu";
            this.chkThu.UseVisualStyleBackColor = true;
            this.chkThu.CheckedChanged += new System.EventHandler(this.chkThu_CheckedChanged);
            // 
            // grbinput
            // 
            this.grbinput.Controls.Add(this.btnClearList);
            this.grbinput.Controls.Add(this.btnclear);
            this.grbinput.Controls.Add(this.labstatus);
            this.grbinput.Controls.Add(this.lstchi);
            this.grbinput.Controls.Add(this.lstthu);
            this.grbinput.Controls.Add(this.rdbchi);
            this.grbinput.Controls.Add(this.rdbthu);
            this.grbinput.Controls.Add(this.btndelete);
            this.grbinput.Controls.Add(this.btnadd);
            this.grbinput.Controls.Add(this.txtinput);
            this.grbinput.Location = new System.Drawing.Point(38, 102);
            this.grbinput.Name = "grbinput";
            this.grbinput.Size = new System.Drawing.Size(467, 306);
            this.grbinput.TabIndex = 4;
            this.grbinput.TabStop = false;
            this.grbinput.Text = "Nhập liệu";
            // 
            // btnClearList
            // 
            this.btnClearList.Location = new System.Drawing.Point(51, 255);
            this.btnClearList.Name = "btnClearList";
            this.btnClearList.Size = new System.Drawing.Size(75, 23);
            this.btnClearList.TabIndex = 9;
            this.btnClearList.Text = "Xóa hết DS";
            this.btnClearList.UseVisualStyleBackColor = true;
            this.btnClearList.Click += new System.EventHandler(this.btnClearList_Click);
            // 
            // btnclear
            // 
            this.btnclear.Location = new System.Drawing.Point(51, 116);
            this.btnclear.Name = "btnclear";
            this.btnclear.Size = new System.Drawing.Size(75, 23);
            this.btnclear.TabIndex = 8;
            this.btnclear.Text = "Xóa ô nhập liệu";
            this.btnclear.UseVisualStyleBackColor = true;
            this.btnclear.Click += new System.EventHandler(this.btnclear_Click);
            // 
            // labstatus
            // 
            this.labstatus.AutoSize = true;
            this.labstatus.Location = new System.Drawing.Point(20, 66);
            this.labstatus.Name = "labstatus";
            this.labstatus.Size = new System.Drawing.Size(0, 15);
            this.labstatus.TabIndex = 7;
            // 
            // lstchi
            // 
            this.lstchi.FormattingEnabled = true;
            this.lstchi.ItemHeight = 15;
            this.lstchi.Items.AddRange(new object[] {
            "100000",
            "50000"});
            this.lstchi.Location = new System.Drawing.Point(337, 65);
            this.lstchi.Name = "lstchi";
            this.lstchi.Size = new System.Drawing.Size(120, 184);
            this.lstchi.TabIndex = 6;
            // 
            // lstthu
            // 
            this.lstthu.FormattingEnabled = true;
            this.lstthu.ItemHeight = 15;
            this.lstthu.Items.AddRange(new object[] {
            "50000",
            "200000"});
            this.lstthu.Location = new System.Drawing.Point(202, 66);
            this.lstthu.Name = "lstthu";
            this.lstthu.Size = new System.Drawing.Size(120, 184);
            this.lstthu.TabIndex = 5;
            
            // 
            // rdbchi
            // 
            this.rdbchi.AutoSize = true;
            this.rdbchi.Location = new System.Drawing.Point(337, 40);
            this.rdbchi.Name = "rdbchi";
            this.rdbchi.Size = new System.Drawing.Size(46, 19);
            this.rdbchi.TabIndex = 4;
            this.rdbchi.Text = " Chi";
            this.rdbchi.UseVisualStyleBackColor = true;
            this.rdbchi.CheckedChanged += new System.EventHandler(this.rdbchi_CheckedChanged);
            // 
            // rdbthu
            // 
            this.rdbthu.AutoSize = true;
            this.rdbthu.Checked = true;
            this.rdbthu.Location = new System.Drawing.Point(202, 40);
            this.rdbthu.Name = "rdbthu";
            this.rdbthu.Size = new System.Drawing.Size(45, 19);
            this.rdbthu.TabIndex = 3;
            this.rdbthu.TabStop = true;
            this.rdbthu.Text = "Thu";
            this.rdbthu.UseVisualStyleBackColor = true;
            this.rdbthu.CheckedChanged += new System.EventHandler(this.rdbthu_CheckedChanged);
            // 
            // btndelete
            // 
            this.btndelete.Location = new System.Drawing.Point(51, 227);
            this.btndelete.Name = "btndelete";
            this.btndelete.Size = new System.Drawing.Size(75, 23);
            this.btndelete.TabIndex = 2;
            this.btndelete.Text = "Xóa";
            this.btndelete.UseVisualStyleBackColor = true;
            this.btndelete.Click += new System.EventHandler(this.btndelete_Click);
            // 
            // btnadd
            // 
            this.btnadd.Location = new System.Drawing.Point(51, 93);
            this.btnadd.Name = "btnadd";
            this.btnadd.Size = new System.Drawing.Size(75, 23);
            this.btnadd.TabIndex = 1;
            this.btnadd.Text = "Thêm";
            this.btnadd.UseVisualStyleBackColor = true;
            this.btnadd.Click += new System.EventHandler(this.btnadd_Click);
            // 
            // txtinput
            // 
            this.txtinput.Location = new System.Drawing.Point(20, 40);
            this.txtinput.Name = "txtinput";
            this.txtinput.Size = new System.Drawing.Size(138, 23);
            this.txtinput.TabIndex = 0;
            this.txtinput.TextChanged += new System.EventHandler(this.txtinput_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Segoe UI", 21.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.label1.Location = new System.Drawing.Point(275, 42);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(322, 40);
            this.label1.TabIndex = 3;
            this.label1.Text = "NGÔN NGỮ LẬP TRÌNH";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.grbtodo);
            this.Controls.Add(this.grbinput);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Nhập liệu";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.grbtodo.ResumeLayout(false);
            this.grbresult.ResumeLayout(false);
            this.grbresult.PerformLayout();
            this.grbseltodo.ResumeLayout(false);
            this.grbseltodo.PerformLayout();
            this.grbinput.ResumeLayout(false);
            this.grbinput.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox grbtodo;
        private System.Windows.Forms.Button btncal;
        private System.Windows.Forms.GroupBox grbresult;
        private System.Windows.Forms.TextBox txtresult;
        private System.Windows.Forms.GroupBox grbseltodo;
        private System.Windows.Forms.CheckBox chkChi;
        private System.Windows.Forms.CheckBox chkThu;
        private System.Windows.Forms.GroupBox grbinput;
        private System.Windows.Forms.Label labstatus;
        private System.Windows.Forms.ListBox lstchi;
        private System.Windows.Forms.ListBox lstthu;
        private System.Windows.Forms.RadioButton rdbchi;
        private System.Windows.Forms.RadioButton rdbthu;
        private System.Windows.Forms.Button btndelete;
        private System.Windows.Forms.Button btnadd;
        private System.Windows.Forms.TextBox txtinput;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnclear;
        private System.Windows.Forms.Button btnClearList;
    }
}

