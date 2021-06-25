import React, { Component } from 'react'
import ProductService from '../services/ProductService'

class ListProductComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                products: []
        }
        this.addProduct = this.addProduct.bind(this);
        this.editProduct = this.editProduct.bind(this);
        this.deleteProduct = this.deleteProduct.bind(this);
    }

    deleteProduct(productId){
        ProductService.deleteProduct(productId).then( res => {
            this.setState({products: this.state.products.filter(product => product.productId !== productId)});
        });
    }
    viewProduct(productId){
        this.props.history.push(`/view-product/${productId}`);
    }
    editProduct(productId){
        this.props.history.push(`/add-product/${productId}`);
    }

    componentDidMount(){
        ProductService.getProducts().then((res) => {
            this.setState({ products: res.data});
        });
    }

    addProduct(){
        this.props.history.push('/add-product/_add');
    }

    render() {
        return (
            <div>
                 <h2 className="text-center">Products List</h2>
                 <div className = "row">
                    <button className="btn btn-primary" onClick={this.addProduct}> Add Product</button>
                 </div>
                 <br></br>
                 <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> Product Id</th>
                                    <th> Product Number</th>
                                    <th> Product Name Id</th>
                                    <th> Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.products.map(
                                        product => 
                                        <tr key = {product.productId}>
                                             <td> { product.productNumber} </td>   
                                             <td> {product.name}</td>
                                             <td>
                                                 <button onClick={ () => this.editProduct(product.productId)} className="btn btn-info">Update </button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => this.deleteProduct(product.productId)} className="btn btn-danger">Delete </button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => this.viewProduct(product.productId)} className="btn btn-info">View </button>
                                             </td>
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table>

                 </div>

            </div>
        )
    }
}

export default ListProductComponent