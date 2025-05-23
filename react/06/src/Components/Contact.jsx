import { Link } from "react-router-dom";

const Contact = () => {
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
      <h1>Contact</h1>
      <p>Welcome to the Contact page!</p>
    </div>
  );
};

export default Contact;
