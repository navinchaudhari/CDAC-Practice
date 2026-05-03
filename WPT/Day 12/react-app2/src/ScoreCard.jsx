import { Component } from "react";

export class ScoreCard extends Component {
  constructor() {
    super();
    this.state = {
      score: 5,
    };
  }

  incrementScore = () => {
    this.setState({ score: this.state.score + 4 });
  };
  decrementScore = () => {
    this.setState({ score: this.state.score - 1 });
  };

  render() {
    return (
      <div>
        <h1>{this.state.score}</h1>
        <button onClick={this.incrementScore}>+</button>
        <button onClick={this.decrementScore}>-</button>
      </div>
    );
  }
}
