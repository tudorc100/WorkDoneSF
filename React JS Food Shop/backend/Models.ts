
export interface UserModel
{
    name:string;
    username:string;
    password:string;
    type:number;
}

export interface Database
{
    user:UserModel[];
    product:ProductModel[];
    order:OrderModel[];
    
}
export interface ProductModel
{
    id:number;
    name:string;
    price:number;
    quantityGrams:number;
    quantity:number;

}
export interface OrderModel
{
    userName:string;
    orderid:number|undefined;
    productids:number[];
}

  
