import React from 'react';
import ReactDOM from 'react-dom';

function FormattedDate(props){
    return <h2>It is {props.date.toLocaleTimeString()}.</h2>
}

class Clock extends React.Component{
    constructor(props){
        super(props);
        this.state={date:new Date()};
    }

    componentDidMount(){
        this.timerID=setInterval(
            ()=>this.tick(),100
        )
    }
    UNSAFE_componentWillMount(){
        clearInterval(this.timerID);
    }

    tick(){
        this.setState({
            date:new Date()
        });
    }

    render(){
        return(
            <div>
                <h1>
                    Hello,World..
                    <FormattedDate date={this.state.date}/>
                </h1>
            </div>
        );
    }
}

function App2(){
    return(
        <div>
            <Clock />

        </div>
    )
}
ReactDOM.render(
    <App2 />,
    document.getElementById('root')
  );
  export default App2;