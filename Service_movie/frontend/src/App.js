import logo from './logo.svg';
import Logo from './pngegg.png';
import './App.css';
import {useEffect, useState} from "react";

function App() {
  const [message, setMessage] = useState([]);

  useEffect(() => {
    fetch("/hello")
        .then((response) => {
          return response.json();
        })
        .then(function (data) {
          setMessage(data);
        });
  }, []);

  return (
      <div className="App">
        <header className="App-header">
            <img src={Logo} className="App-logo1"/>
        </header>
          <ul className="text">
              {message.map((text, index) => <li key={`${index}-${text}`}>{text}</li>)}
          </ul>
      </div>
  );
}

export default App;