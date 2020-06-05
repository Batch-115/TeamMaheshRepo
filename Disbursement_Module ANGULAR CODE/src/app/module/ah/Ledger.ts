export class Ledger 
{
    id:number;
    name:string;
    emi_no: number;
    date: string;
    emi_amt: number;
    
    principal_amt: number;
    
    loan_interest: number;
    Os_principal_amt: number;

    constructor(emi_no, due_date, emi_amt, principal_amt, interest_amt, Os_principal_amt)
    {
      this.emi_no=emi_no;
      this.date=due_date;
      this.emi_amt=emi_amt;
      this.principal_amt=principal_amt;
      this.loan_interest=interest_amt;
      this.Os_principal_amt=Os_principal_amt;
    }
  }
