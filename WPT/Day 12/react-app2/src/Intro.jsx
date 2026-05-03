export function Intro(props) {
  //   console.log(props);
  const { title, description, buttonText } = props;

  return (
    <div>
      <h1>{title}</h1>
      <p>{description}</p>
      <button>{buttonText}</button>
    </div>
  );
}
