import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div>
      <nav>
        <ul>
          <li>
            <a href="/">Home</a>
          </li>
          <li>
            <link to="/about">About</link>
          </li>
        </ul>
      </nav>
      <h1>HOME</h1>
      <p>Welcome to the home page!</p>
    </div>
  );
};

export default Home;
