import "./App.css";
import { Header } from "./Header";
import { Intro } from "./Intro";
import { ScoreBoard } from "./ScoreBoard";
import { ScoreCard } from "./ScoreCard";

function App() {
  return (
    <div>
      <h1>App Component</h1>
      <ScoreBoard/>
      <ScoreCard />
      <Intro
        title="Good Morning"
        description="This is 1st Intro"
        buttonText="Click Now"
      ></Intro>
      <Header
        title="Good Morning Header"
        description="This is 1st Header"
        buttonText="Click here"
      ></Header>
    </div>
  );
}

export default App;
