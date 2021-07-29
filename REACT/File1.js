import React from 'react';
import ReactDOM from 'react-dom';


function Welcome(props) {
    return <h1>Hello, {props.name}</h1>;
  }
  
  function App1() {
    return (
      <div>
        <Welcome name="Saha" />
        <Welcome name="Cahal" />
        <Welcome name="Edite" />
      </div>
    );
  }
  
  ReactDOM.render(
    <App1 />,
    document.getElementById('root')
  );

//ReactDOM.render(<h1>Hello World Hi</h1>, document.getElementById('root'));

export default App1;