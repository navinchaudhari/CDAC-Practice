import { useState } from "react";

export function ScoreBoard() {
  const [score, setScore] = useState(0);
  const incrementScore = () => {
    setScore(score + 5);
  };
  const decrementScore = () => {
    setScore(score - 2);
  };

  return (
    <div>
      <h1>{score}</h1>
      <button onClick={incrementScore}>+</button>
      <button onClick={decrementScore}>-</button>
    </div>
  );
}
