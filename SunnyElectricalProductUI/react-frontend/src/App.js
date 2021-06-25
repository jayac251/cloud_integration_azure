import React from 'react';
/*import logo from './logo.svg';*/
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import ListProductComponent from './components/ListProductComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
/*import CreateProductComponent from './components/CreateProductComponent';
import ViewProductComponent from './components/ViewProductComponent'; */

function App() {
  return (
    <div>
        <Router>
              <HeaderComponent />
                <div className="container">
                    <Switch> 
                          <Route path = "/" exact component = {ListProductComponent}></Route>
                          <Route path = "/employees" component = {ListProductComponent}></Route>
                          {/*<Route path = "/add-employee/:productId" component = {CreateProductComponent}></Route>
                          <Route path = "/view-employee/:productId" component = {ViewProductComponent}></Route>
                           <Route path = "/update-employee/:productId" component = {UpdateProductComponent}></Route> */}
                    </Switch>
                </div>
              <FooterComponent />
        </Router>
    </div>
    
  );
}

export default App;