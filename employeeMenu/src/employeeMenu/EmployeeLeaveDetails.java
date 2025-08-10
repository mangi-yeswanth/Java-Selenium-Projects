package employeeMenu;

import java.util.ArrayList;

class EmployeeLeaveDetails {
	private int EarnedLeaves;
	private int CasualLeaves;
	private int sickLeaves;
	private int annualLeaves;
	private int remainingLeaves;
	
	
	
	public EmployeeLeaveDetails(int earnedLeaves, int casualLeaves, int sickLeaves) {
		super();
		EarnedLeaves = earnedLeaves;
		CasualLeaves = casualLeaves;
		this.sickLeaves = sickLeaves;
		calculateLeaves();
	}

	public int getEarnedLeaves() {
		return EarnedLeaves;
	}
	public void setEarnedLeaves(int earnedLeaves) {
		EarnedLeaves = earnedLeaves;
	}
	public int getCasualLeaves() {
		return CasualLeaves;
	}
	public void setCasualLeaves(int casualLeaves) {
		CasualLeaves = casualLeaves;
	}
	public int getSickLeaves() {
		return sickLeaves;
	}
	public void setSickLeaves(int sickLeaves) {
		this.sickLeaves = sickLeaves;
	}
	public int getAnnualLeaves() {
		return annualLeaves;
	}
	public void setAnnualLeaves(int annualLeaves) {
		this.annualLeaves = annualLeaves;
	}
	public int getRemainingLeaves() {
		return remainingLeaves;
	}
	public void setRemainingLeaves(int remainingLeaves) {
		this.remainingLeaves = remainingLeaves;
	}

	ArrayList<EmployeeLeaveDetails> leaveDetails = new ArrayList<>();

    EmployeeLeaveDetails() {
        leaveDetails.add(new EmployeeLeaveDetails(15,5,7));
    }
    private void calculateLeaves() {
        this.annualLeaves = this.sickLeaves + this.CasualLeaves;
        if (this.annualLeaves > this.EarnedLeaves) {
            this.remainingLeaves = 0;
        } else {
            this.remainingLeaves = this.EarnedLeaves - this.annualLeaves;
        }
    }
    void display() {
    	 System.out.println("Leave Details:");
         for (EmployeeLeaveDetails detail : leaveDetails) {
             System.out.println("Earned Leaves: " + detail.getEarnedLeaves());
             System.out.println("Casual Leaves: " + detail.getCasualLeaves());
             System.out.println("Sick Leaves: " + detail.getSickLeaves());
             System.out.println("Annual Leaves: " + detail.getAnnualLeaves());
             System.out.println("Remaining Leaves: " + detail.getRemainingLeaves());
             System.out.println();
         }
     }
}
