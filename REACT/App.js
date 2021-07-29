import logo from './logo.svg';
import './App.css';
import Home from './Home';
import About from './About';
import {BrowserRouter as Router, Route,NavLink } from 'react-router-dom';

function App() {
  return (
    <Router>
    <div className="App">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
    <NavLink exact to="/" className="my-link">Home</NavLink>
            <NavLink exact to="/about" className="my-link">About</NavLink>
      
      <li class="nav-item">
        <a class="nav-link" href="#">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About</a>
      </li>
     
    </ul>
  </div>
</nav>
    </div>
    <Route exact path="/">
      <Home />
    </Route>
    <Route exact path="/about">
      <About />
    </Route>
    </Router>
  );
}

export default App;
