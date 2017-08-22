import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

var URLS = [
  { 'url': 'hello.com', 'shortened': 'hello' },
  { 'url': 'hello2.com', 'shortened': 'hello2' }
]

class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to Kusu</h2>
        </div>
        <UrlList urls={URLS} />
      </div>
    );
  }
}



var Url = React.createClass({
  render: function() {
    return (
      <tr key={this.props.url.url}>
        <td>{this.props.url.url}</td>
        <td>{this.props.url.shortened}</td>
      </tr>
    );
  }
})

class UrlList extends Component {
  constructor(props) {
    super(props);
    this.state = { rows: [] };    
  }

  componentDidMount() {
    fetch('http://local.com:8080/urls').then((result) => result.json()).then(items => {
      this.setState({ rows: items.map(url => <Url url={url} />) })
    });
  }

  render() {
    return (
      <div className="url-list">
        <h1>List of Shortened Urls</h1>
        <table>
          <thead>
            <tr>
              <th>Url</th>
              <th>Shortened</th>
            </tr>
         </thead>
         <tbody>{this.state.rows}</tbody>
        </table>
      </div>
    );
    
  }
}

export default App;
