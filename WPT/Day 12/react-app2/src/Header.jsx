import { Component } from "react";
export class Header extends Component {
  render() {
    return (
      <div>
        <h1>{this.props.title}</h1>
        <p>{this.props.description}</p>
        <button>{this.props.buttonText}</button>
      </div>
    );
  }
}
