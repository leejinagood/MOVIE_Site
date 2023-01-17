import Logo from './pngegg.png';
import './App.css';
import {useEffect, useState} from "react";

function App() {
    const [message, setMessage] = useState("");

    useEffect(() => {
        fetch('/mypage')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });

        fetch('/login')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });

        fetch('/signup')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });



    },[])
    return (
        <div className="App">
            <header className="App-header">
                <h6 className="App-title">{message}</h6>
            </header>
        </div>
    )



}





export default App;



