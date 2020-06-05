export class Disbursement 
{
    id: number;
    date: Date;
    name: string;
    addr: string;
    contact: number;
    principal_amt: number;
    loan_roi: number;
    emi_amt: number;
    equip_name: string;
    equip_model_no: string;
    equip_price: number;    
    emi_no_paid: number;
    emi_no_total: number;
    emi_start_date: Date;
    emi_end_date: Date;
    Os_principal_amt: number;
    doc_verify_status: string;
    application_status: string;
    action_taken: string;

    acc_no: string;
    ifsc: string;

    loan_interest:number;
    tenure:number;
    emi_no:number;

    monthly_principal:number;
}
